package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosyayonetimi {

    public void dosyaOlusturma(){
        try {
            File myObj = new File("filename.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }
    }

    public void dosyayaYaz(){
        try {
            FileWriter writer = new FileWriter("filename.txt");
            writer.write("Dosya ilk yazi");
            writer.close();
            System.out.println("Dosyaya yazma islemi basarili.");
        }catch (IOException e){
            System.out.println("Bir hata olustu.");
            e.printStackTrace();
        }
    }
    public void dosyaOku(){
        File myObj = new File("filename.txt");
        try(Scanner oku = new Scanner(myObj)) {
            while (oku.hasNextLine()) {
                String line = oku.nextLine();
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Bir hata olustu.");
            e.printStackTrace();
        }
    }


}

