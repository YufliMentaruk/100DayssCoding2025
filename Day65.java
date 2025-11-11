import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int a = ip.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= a; i++) {
            faktorial *= i;
        }
        System.out.println("Hasil faktorial dari " + a + " adalah: " + faktorial);
    }
}
