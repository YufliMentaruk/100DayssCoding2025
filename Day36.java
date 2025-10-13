import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Masukkan Nilai: ");
        int nilai = ip.nextInt();
        if (nilai >= 75) {
            System.out.println("Kamu lulus.");
            if (nilai >= 90) {
                System.out.println("Nilai sangat baik (A).");
            } else if (nilai >= 80) {
                System.out.println("Nilai baik (B).");
            } else {
                System.out.println("Nilai cukup (C).");
            }
        } else {
            System.out.println("Kamu tidak lulus.");
        }
    }
}
