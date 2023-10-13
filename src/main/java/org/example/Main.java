package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<MoominCharacter> MoominValley = new ArrayList<MoominCharacter>();
        MoominValley.add(new MoominCharacter("Moomintroll", "ムーミントロール"));
        MoominValley.add(new MoominCharacter("Floren", "フローレン"));
        MoominValley.add(new MoominCharacter("Moominpappa", "ムーミンパパ"));
        MoominValley.add(new MoominCharacter("Moominmamma", "ムーミンママ"));
        MoominValley.add(new MoominCharacter("Little My", "リトルミイ"));
        MoominValley.add(new MoominCharacter("Snufkin", "スナフキン"));
        MoominValley.add(new MoominCharacter("Snork", "スノーク"));
        MoominValley.add(new MoominCharacter("Sniff", "スニフ"));
        MoominValley.add(new MoominCharacter("Mimble", "ミムラ"));
        MoominValley.add(new MoominCharacter("Hemulen", "ヘムレンさん"));
        MoominValley.add(new MoominCharacter("Too-Ticky", "トゥーティッキ"));
        MoominValley.add(new MoominCharacter("Stinky", "スティンキー"));
        MoominValley.add(new MoominCharacter("the Groke", "モラン"));
        MoominValley.add(new MoominCharacter("the Hattifatteners", "ニョロニョロ"));

        for (int i = 0; i < MoominValley.size(); i++) {
            if (MoominValley.get(i).getEnglishName().startsWith("M") ) {
                System.out.println("名前：" + MoominValley.get(i).getJapaneseName());
            }
        }
    }
}

