import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = ip.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = ip.nextInt();

        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilih = ip.nextInt();
        
        int hasil1;
        double hasil2;
        switch (pilih) {
            case 1:
                hasil1 = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil1);
                break;
            case 2:
                hasil1 = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil1);
                break;
            case 3:
                hasil1 = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil1);
                break;
            case 4:
                 hasil2 = angka1 / angka2;
                 System.out.println("Hasil Pembagian: " + hasil2);
                break;
            default:
                System.out.println("Pilihan tidak ada Silakan pilih 1-4.");
                break;
        }
    }
}
