import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dosyaAdi = "notlar.txt";
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(dosyaAdi);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();
            System.out.println("Metin başarıyla kaydedildi.");
        } catch (IOException e) {
            System.err.println("Dosya kaydetme hatası: " + e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader(dosyaAdi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            bufferedReader.close();
            if (okunanMetin != null) {
                System.out.println("En son kaydedilen metin: " + okunanMetin);
            } else {
                System.out.println("Henüz kaydedilmiş bir metin bulunamadı.");
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}