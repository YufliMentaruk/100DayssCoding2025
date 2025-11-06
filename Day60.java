import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int N = ip.nextInt();

        System.out.println("Angka Ganjil dari "+ N +" hingga 1 :");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        System.out.println("Angka Genap dari " + N + " hingga 1 :");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
