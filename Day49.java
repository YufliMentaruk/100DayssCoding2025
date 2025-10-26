import java.util.Scanner;
public class Day49 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka\t:");
        int angka = ip.nextInt();

        String hasil = (angka > 0) ? "Angka Positif" : (angka < 0) ?  "Angka Negatif" : "Angka Nol";
        System.out.println("Hasil: " + hasil);
    }
}
