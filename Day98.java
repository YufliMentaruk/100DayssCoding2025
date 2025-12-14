import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int N = ip.nextInt();
        int a = 0, b = 1;
        System.out.println("Deretan Fibonacci:");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
