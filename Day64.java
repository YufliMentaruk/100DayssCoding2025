import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan nilai M :");
        int M = ip.nextInt();
        System.out.print("Masukkan nilai Pangkat N :");
        int N = ip.nextInt();

        int a = 1;
        for (int i = 1; i <= N; i++) {
            a *= M;
        }
        System.out.println("Hasil dari " + M + " pangkat " + N + " adalah: " + a);
    }
}
