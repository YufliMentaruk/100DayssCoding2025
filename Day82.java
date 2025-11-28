import java.util.Scanner;
public class Day82 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // Menbuat Ukuran array
        int[] angka = new int[5];
        // Mengisi array menggunakan input
        System.out.println("Masukkan 5 angka");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ":");
            angka[i] = ip.nextInt();
        }
        // Menampilkan semua elemen array
        System.out.println("\nIsi array adalah:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ":" + angka[i]);
        }
    }
}
