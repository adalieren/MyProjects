package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kisi[] kisiler = {new Ogrenci("Eren", "ADali", 20, 412, 11, "EA"),
                new Ogretmen("Can", "Yılmaz", 32, 7, "Matematik", 42550),
                new Personel("Cem", "Kağan", 30, "Sekreter", 35000)

        };
        Kisi kisi = new Ogrenci("Eren" , "ADali", 20, 412, 11, "EA");
                kisi.kisiBilgisi();
    }
}