package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DosyaYoneticisi yonetici = new DosyaYoneticisi();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Sisteme kaydedilecek mesajı girin: ");
            String girdi = scanner.nextLine();


            if (girdi == null || girdi.trim().isEmpty()) {
                throw new LogIstisnasi("Hata: Boş log mesajı kaydedilemez!");
            }

            yonetici.logKaydet(girdi);

        } catch (LogIstisnasi e) {
            System.out.println("Özel Hata Yakalandı: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Beklenmedik bir hata oluştu.");
        } finally {
            System.out.println("İşlem adımı tamamlandı.");
            scanner.close();
        }


        yonetici.loglariOku();
    }
}