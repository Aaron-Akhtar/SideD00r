package me.aaronakhtar.sided00r.art;

import static me.aaronakhtar.sided00r.art.SideD00rArt.LINE_BREAK;

public enum SideD00rArtEnum {

    // DESCENDING ORDER
    VERSION_NOTICE(new String(TermUtils.Colour.YELLOW.get() + "SideD00r Version 1.0.1.1 - Its just a " + TermUtils.Colour.WHITE.get() + LINE_BREAK).split(LINE_BREAK)),
    SIDED00R(new String(
            " $$$$$$\\  $$\\       $$\\           $$$$$$$\\   $$$$$$\\   $$$$$$\\            " +LINE_BREAK+
            "$$  __$$\\ \\__|      $$ |          $$  __$$\\ $$$ __$$\\ $$$ __$$\\           " +LINE_BREAK+
            "$$ /  \\__|$$\\  $$$$$$$ | $$$$$$\\  $$ |  $$ |$$$$\\ $$ |$$$$\\ $$ | $$$$$$\\  " +LINE_BREAK+
            "\\$$$$$$\\  $$ |$$  __$$ |$$  __$$\\ $$ |  $$ |$$\\$$\\$$ |$$\\$$\\$$ |$$  __$$\\ " +LINE_BREAK+
            " \\____$$\\ $$ |$$ /  $$ |$$$$$$$$ |$$ |  $$ |$$ \\$$$$ |$$ \\$$$$ |$$ |  \\__|" +LINE_BREAK+
            "$$\\   $$ |$$ |$$ |  $$ |$$   ____|$$ |  $$ |$$ |\\$$$ |$$ |\\$$$ |$$ |      " +LINE_BREAK+
            "\\$$$$$$  |$$ |\\$$$$$$$ |\\$$$$$$$\\ $$$$$$$  |\\$$$$$$  /\\$$$$$$  /$$ |      " +LINE_BREAK+
            " \\______/ \\__| \\_______| \\_______|\\_______/  \\______/  \\______/ \\__|      ").split(LINE_BREAK));

    private String[] art;

    SideD00rArtEnum(String[] art) {
        this.art = art;
    }

    public String[] getArt() {
        return art;
    }
}
