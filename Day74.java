import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("===== MENU MINUMAN =====");
            System.out.println("1. Kopi Hitam");
            System.out.println("2. Cappuccino");
            System.out.println("3. Teh Manis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4):");
            pilih = ip.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Anda memilih Kopi Hitam");
                    System.out.println("Harga: Rp 10.000");
                    break;
                case 2:
                    System.out.println("Anda memilih Cappuccino");
                    System.out.println("Harga: Rp 15.000");
                    break;
                case 3:
                    System.out.println("Anda memilih Teh Manis");
                    System.out.println("Harga: Rp 7.000");
                    break;
                case 4:
                    System.out.println("Anda Memilih Keluar. Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak ada. Silakan coba lagi");
                    break;
            }
          }  while (pilih != 4) ;
    }
}
