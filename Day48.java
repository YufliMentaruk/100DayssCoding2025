import java.util.Scanner;
public class Day48 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = ip.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = ip.nextDouble();

        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilih = ip.nextInt();

        double hasil;
        switch (pilih) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                 hasil = angka1 / angka2;
                 System.out.println("Hasil Pembagian: " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak ada Silakan pilih 1-4.");
                break;
        }
    }
}
