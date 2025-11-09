import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Masukkan Nilai :");
        int N = ip.nextInt();
        int a=1;

        for (int i = 1; i <= N; i++) {
            a *= i;
        }
        System.out.println("Hasil Perkalian bilangan dari 1 sampai " + N + " adalah: " + a);
    }
}
