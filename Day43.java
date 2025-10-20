import java.util.Scanner;
public class Day43 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = ip.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 3 dan 5.");
        } else if (angka % 3 == 0) {
            System.out.println(angka + " adalah kelipatan 3.");
        } else if (angka % 5 == 0) {
            System.out.println(angka + " adalah kelipatan 5.");
        }
    }
}
