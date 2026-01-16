package org.example;

public class Methods {
    public void checkAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Yetkisiz giris. En az 18 yasında olmalısın.");
        }else {
            System.out.println("Giris izni verildi.");
        }
    }
}
