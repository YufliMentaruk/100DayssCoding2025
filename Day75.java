import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan Teks :");
        String teks = ip.nextLine();

        //Teks yang di input
        System.out.println("Teks asli :" + teks);
        // Mengecek panjang string
        System.out.println("Panjang teks :" + teks.length());
        // Membuat menjadi huruf besar
        System.out.println("Huruf besar :" + teks.toUpperCase());
        // Membuat menjadi huruf kecil
        System.out.println("Huruf kecil :" + teks.toLowerCase());
    }
}
