package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<MoominCharacter> moominValley = new ArrayList<MoominCharacter>();
        moominValley.add(new MoominCharacter("Moomintroll", "ムーミントロール"));
        moominValley.add(new MoominCharacter("Floren", "フローレン"));
        moominValley.add(new MoominCharacter("Moominpappa", "ムーミンパパ"));
        moominValley.add(new MoominCharacter("Moominmamma", "ムーミンママ"));
        moominValley.add(new MoominCharacter("Little My", "リトルミイ"));
        moominValley.add(new MoominCharacter("Snufkin", "スナフキン"));
        moominValley.add(new MoominCharacter("Snork", "スノーク"));
        moominValley.add(new MoominCharacter("Sniff", "スニフ"));
        moominValley.add(new MoominCharacter("Mimble", "ミムラ"));
        moominValley.add(new MoominCharacter("Hemulen", "ヘムレンさん"));
        moominValley.add(new MoominCharacter("Too-Ticky", "トゥーティッキ"));
        moominValley.add(new MoominCharacter("Stinky", "スティンキー"));
        moominValley.add(new MoominCharacter("the Groke", "モラン"));
        moominValley.add(new MoominCharacter("the Hattifatteners", "ニョロニョロ"));

        for (int i = 0; i < moominValley.size(); i++) {
            if (moominValley.get(i).getEnglishName().startsWith("M") ) {
                System.out.println("名前：" + moominValley.get(i).getJapaneseName());
            }
        }
    }
}

