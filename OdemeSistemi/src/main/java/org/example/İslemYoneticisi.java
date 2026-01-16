package org.example;

import java.util.ArrayList;

public class İslemYoneticisi {
    private ArrayList<Odeme> islemler=new ArrayList<>();

    public void islemEkle(Odeme o){
        islemler.add(o);
    }
}
