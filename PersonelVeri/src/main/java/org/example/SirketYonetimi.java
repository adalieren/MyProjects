package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class SirketYonetimi {
    private ArrayList<Calisan> calisanlar=new ArrayList<>();

    public SirketYonetimi() {
        this.calisanlar=new ArrayList<>();
    }

    public void verileriYukle(){
        calisanlar.add(new Calisan("Uğur", "Yazılım", 65000));
        calisanlar.add(new Calisan("Ayşe", "Yazılım", 45000));
        calisanlar.add(new Calisan("Mehmet", "Pazarlama", 30000));
        calisanlar.add(new Calisan("Zeynep", "Yazılım", 70000));
        calisanlar.add(new Calisan("Ali", "İK", 35000));
        calisanlar.add(new Calisan("Can", "Pazarlama", 55000));
    }

    public void yazilimcilariListele(){
        calisanlar.stream().filter(c -> c.getDepartman().equals("Yazılım")).forEach(c -> System.out.println(c.getIsim()));
    }
    public double maasOrtalamasi(){
        return calisanlar.stream().mapToDouble(Calisan::getMaas).average().orElse(0.0);
    }
    //50K'dan fazla olanları sayma
    public long yuksekMaaslilariSay(){
        return calisanlar.stream().filter(c -> c.getMaas() > 50000 ).count();
    }
    public void ismeGoreSirala(){
        System.out.println("Personel Listesi:");
        calisanlar.stream().sorted(Comparator.comparing(Calisan::getIsim)).forEach(c -> System.out.println(c.getIsim() + " (" + c.getDepartman() + ")"));
    }
    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }

}
