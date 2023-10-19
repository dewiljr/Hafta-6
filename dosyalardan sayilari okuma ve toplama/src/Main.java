import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaAdi = "sayilar.txt"; // Dosya adını buraya yazın

        try {
            BufferedReader br = new BufferedReader(new FileReader(dosyaAdi));
            String satir;
            int toplam = 0;

            while ((satir = br.readLine()) != null) {
                int sayi = Integer.parseInt(satir);
                toplam += sayi;
            }

            br.close();

            System.out.println("Toplam: " + toplam);
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}