package org.example;

public class MoominCharacter {
    private String englishName;
    private String japaneseName;

    public MoominCharacter(String englishName, String japaneseName) {
        this.englishName = englishName;
        this.japaneseName = japaneseName;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getJapaneseName() {
        return this.japaneseName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setJapaneseName(String japaneseName) {
        this.japaneseName = japaneseName;
    }
}

