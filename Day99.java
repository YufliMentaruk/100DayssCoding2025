import java.util.Scanner;
public class Day99 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int N = ip.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + N + " adalah:");
        for (int i = 2; i <= N; i++) {
            boolean p = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.print(i + " ");
            }
        }
    }
}
