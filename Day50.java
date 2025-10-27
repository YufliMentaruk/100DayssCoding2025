import java.util.Scanner;
public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Angka Genap" : "Angka Ganjil";

        System.out.println("Hasil: " + hasil);
    }
}
