package org.example;
import java.util.List;
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



//MoominCharacterを作り、MoominCharacterを要素にもつListを作成してfor文で和名と英名を表示する処理
//フィールド変数に値を入れるのでなくコンストラクタを介してフィールド変数を設定
//List.of("Moomintroll", "Floren", "Moominpappa", "Moominmamma", "Little My", "Snufkin", "Snork", "Sniff", "Mimble", "Hemulen", "Too-Ticky", "Stinky", "the Groke", "the Hattifatteners");