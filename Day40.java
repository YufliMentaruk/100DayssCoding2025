import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka 1: ");
        double a = ip.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = ip.next().charAt(0);
        System.out.print("Masukkan angka 2: ");
        double b = ip.nextDouble();

        double hasil = 0;
        if (operator == '+') {
            hasil = a + b;
        } else if (operator == '-') {
            hasil = a - b;
        } else if (operator == '*') {
            hasil = a * b;
        } else if (operator == '/') {
            if (b != 0) {
                hasil = a / b;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                return;
            }
        } else {
            System.out.println("Operator tidak valid!");
            return;
        }
        System.out.println("Hasil: " + hasil);
    }
}



