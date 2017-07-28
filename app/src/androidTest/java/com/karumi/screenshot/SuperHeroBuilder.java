package com.karumi.screenshot;


import com.karumi.screenshot.model.SuperHero;

/**
 * Created by LRevilla on 28/07/17.
 */

public class SuperHeroBuilder {

    private static final String ANY_NAME = "";
    private static final String ANY_PHOTO = null;
    private static final boolean ANY_AVENGER = false;
    private static final String ANY_DESC = "";

    private String name = ANY_NAME;
    private String photo = ANY_PHOTO;
    private boolean isAvenger = ANY_AVENGER;
    private String description = ANY_DESC;

    public SuperHeroBuilder name(String name) {
        this.name = name;
        return this;
    }

    public SuperHeroBuilder photo(String photo) {
        this.photo = photo;
        return this;
    }

    public SuperHeroBuilder avenger(boolean isAvenger) {
        this.isAvenger = isAvenger;
        return this;
    }

    public SuperHeroBuilder description(String description) {
        this.description = description;
        return this;
    }

    public SuperHero build() {
        return new SuperHero(name, photo, isAvenger, description);
    }
}
