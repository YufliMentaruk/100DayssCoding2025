import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);

        int a =1;
        System.out.print("Masukkan Angka:");
        int b =ip.nextInt();

        while (a <= b) {
            System.out.println("Angka ke-" + a);
            a++;
        }
    }
}
