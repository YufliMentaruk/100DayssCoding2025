import java.util.Scanner;
public class Day66 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int N = ip.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(" * * ");
        }
    }
}
