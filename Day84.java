import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // Membuat Ukuran Array
        System.out.print("Masukkan jumlah Array:");
        int a = ip.nextInt();
        int b=0;
        int angka[] = new int[a];
        // Menjumlahkan Nilai Array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan nilai"+i+":");
            angka[i]=ip.nextInt();
            b+=angka[i];
        }
        System.out.println("Hasil Jumlah Nilai Array "+b);
    }
}
