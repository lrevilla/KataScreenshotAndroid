/*
 * Copyright (C) 2017 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.karumi.screenshot;

import android.app.Activity;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import com.karumi.screenshot.di.MainComponent;
import com.karumi.screenshot.di.MainModule;
import com.karumi.screenshot.model.SuperHero;
import com.karumi.screenshot.model.SuperHeroesRepository;
import com.karumi.screenshot.ui.view.MainActivity;
import it.cosenonjaviste.daggermock.DaggerMockRule;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.mockito.Mockito.when;

public class MainActivityTest extends ScreenshotTest {

  private static boolean ANY_AVENGER = false;
  @Rule public DaggerMockRule<MainComponent> daggerRule =
      new DaggerMockRule<>(MainComponent.class, new MainModule()).set(
          new DaggerMockRule.ComponentSetter<MainComponent>() {
            @Override public void setComponent(MainComponent component) {
              SuperHeroesApplication app =
                  (SuperHeroesApplication) InstrumentationRegistry.getInstrumentation()
                      .getTargetContext()
                      .getApplicationContext();
              app.setComponent(component);
            }
          });

  @Rule public IntentsTestRule<MainActivity> activityRule =
      new IntentsTestRule<>(MainActivity.class, true, false);

  @Mock SuperHeroesRepository repository;

  @Test public void showsEmptyCaseIfThereAreNoSuperHeroes() {
    givenThereAreNoSuperHeroes();

    Activity activity = startActivity();

    compareScreenshot(activity);
  }

  @Test public void showsOneRowIfThereIsOneSuperHero() {
    this.ANY_AVENGER = true;
    givenThereIsOneSuperHero();

    Activity activity = startActivity();

    compareScreenshot(activity);
  }

  @Test public void showsSomeRowsIfThereAreTenSuperHeroes() {
    this.ANY_AVENGER = true;
    givenThereAreSomeSuperHeroes(10);

    Activity activity = startActivity();

    compareScreenshot(activity);
  }

  @Test public void showsEndOfSuperHeroList() {
    this.ANY_AVENGER = true;
    givenThereAreSomeSuperHeroes(100);

    Activity activity = startActivity();

    onView(withId(R.id.recycler_view))
      .perform(RecyclerViewActions.actionOnItemAtPosition(99, scrollTo()));

    compareScreenshot(activity);
  }

  private List<SuperHero> givenThereIsOneSuperHero() {
    return givenThereAreSomeSuperHeroes(1);
  }

  private List<SuperHero> givenThereAreSomeSuperHeroes(int numberOfSuperHeroes) {
    List<SuperHero> superHeroes = new LinkedList<>();
    for (int i = 0; i < numberOfSuperHeroes; i++) {
      String superHeroName = "SuperHero - " + i;
      String superHeroDescription = "Description Super Hero - " + i;
      SuperHero superHero = new SuperHero(superHeroName, null, ANY_AVENGER, superHeroDescription);
      superHeroes.add(superHero);
      when(repository.getByName(superHeroName)).thenReturn(superHero);
    }
    when(repository.getAll()).thenReturn(superHeroes);
    return superHeroes;
  }

  private void givenThereAreNoSuperHeroes() {
    when(repository.getAll()).thenReturn(Collections.<SuperHero>emptyList());
  }

  private MainActivity startActivity() {
    return activityRule.launchActivity(null);
  }
}