import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int a = ip.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int b = ip.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
