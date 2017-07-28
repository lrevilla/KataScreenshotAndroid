package com.karumi.screenshot;

import com.karumi.screenshot.model.SuperHero;

/**
 * Created by LRevilla on 28/07/17.
 */

class SuperHeroMother {


    public static SuperHero createAvenger() {
        return new SuperHeroBuilder()
                .avenger(true)
                .build();
    }

    public static SuperHero createSuperHero() {
        return new SuperHeroBuilder()
                .build();
    }

    public static SuperHero createGermanSuperHero() {
        return new SuperHeroBuilder()
                .name("Magnusaklsdjajdhjkahdkajemdnakxahdsjhasidh" +
                        "akjdhbajdsyaudgahdgasjdyajdgajhdgadgajhdgasjdg" +
                        "ashjdgajdgashjgsghjsagdahjsdgahjsgd" +
                        "ahjgdsahjgdajhgashjdahjdsajhgajh")
                .description("MjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfgMjōundaklsdjajksdhaskdhasjksdhajkdhsajkdhajkdhadjlbdjbsmdfbasdjkbfasjfgdajksfgadsljfgdalsfdgfassfgasjhfghjfdasfgdasjhfdghjasfgjkasgfasgdhfgashfgajhsfg")
                .build();
    }

    public static SuperHero createJapaneseSuperHero() {
        return new SuperHeroBuilder()
                .name("(╯°□°）╯︵ ┻━┻")
                .description("┻━┻ ︵ヽ(`Д´)ﾉ︵ ┻━┻ ")
                .build();
    }

    public static SuperHero createMillenialSuperHero() {
        return new SuperHeroBuilder()
                .name("IRON\uD83D\uDE00\uD83D\uDE00")
                .description("DESC for \uD83D\uDE02\uD83D\uDE02 ")
                .build();
    }
}
