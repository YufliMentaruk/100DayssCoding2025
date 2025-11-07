import java.util.Scanner;
public class Day61 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai N :");
        int N = ip.nextInt();
        System.out.print("Masukkan kelipatan M :");
        int M = ip.nextInt();

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah:");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
