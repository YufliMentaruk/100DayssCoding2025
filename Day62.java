import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Masukkan Nilai :");
        int N = ip.nextInt();
        int jumlah=0;

        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        System.out.println("Jumlah bilangan dari 1 sampai " + N + " adalah: " + jumlah);
    }
}
