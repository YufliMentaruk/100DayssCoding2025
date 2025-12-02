import java.util.Scanner;
public class Day86 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // Membuat Ukuran Array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = ip.nextInt();
        int[] angka = new int[n];
        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = ip.nextInt();
        }
        // Mencari angka maksimal
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka terkecil dalam array adalah: " + min);
    }
}
