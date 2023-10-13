package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<MoominCharacter> Moominvalley = new ArrayList<MoominCharacter>();
        Moominvalley.add(new MoominCharacter("Moomintroll", "ムーミントロール"));
        Moominvalley.add(new MoominCharacter("Floren", "フローレン"));
        Moominvalley.add(new MoominCharacter("Moominpappa", "ムーミンパパ"));
        Moominvalley.add(new MoominCharacter("Moominmamma", "ムーミンママ"));
        Moominvalley.add(new MoominCharacter("Little My", "リトルミイ"));
        Moominvalley.add(new MoominCharacter("Snufkin", "スナフキン"));
        Moominvalley.add(new MoominCharacter("Snork", "スノーク"));
        Moominvalley.add(new MoominCharacter("Sniff", "スニフ"));
        Moominvalley.add(new MoominCharacter("Mimble", "ミムラ"));
        Moominvalley.add(new MoominCharacter("Hemulen", "ヘムレンさん"));
        Moominvalley.add(new MoominCharacter("Too-Ticky", "トゥーティッキ"));
        Moominvalley.add(new MoominCharacter("Stinky", "スティンキー"));
        Moominvalley.add(new MoominCharacter("the Groke", "モラン"));
        Moominvalley.add(new MoominCharacter("the Hattifatteners", "ニョロニョロ"));

        for (int i = 0; i < Moominvalley.size(); i++) {
            if (Moominvalley.get(i).getEnglishName().startsWith("M") ) {
            System.out.println("名前：" + Moominvalley.get(i).getJapaneseName());
            }
        }
    }
}

