package org.example;

import java.io.*;

public class DosyaYoneticisi {
    private final String dosya = "loglar.txt";

    public void logKaydet(String mesaj) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosya, true))) {
            writer.write(mesaj);
            writer.newLine();
            System.out.println("Sistem: Log dosyasına yazıldı");
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası olustu: " + e.getMessage());
        }
    }

    public void loglariOku() {
        try (BufferedReader reader = new BufferedReader(new FileReader(dosya))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                System.out.println(">" + satir);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");
        } catch (IOException e) {
            System.err.println("Dosya okuma hatasi " + e.getMessage());
        }
    }

}
