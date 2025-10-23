import java.util.Scanner;
public class Day46 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("===== MENU MINUMAN =====");
        System.out.println("1. Kopi Hitam");
        System.out.println("2. Cappuccino");
        System.out.println("3. Teh Manis");
        System.out.println("4. Kopi Susu");
        System.out.print("Pilih menu (1-4):");
        int pilih =ip.nextInt();

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
                System.out.println("Anda Memilih Kopi Susu");
                System.out.println("Harga: Rp 13.000");
                break;
            default:
                System.out.println("Pilihan tidak ada. Silakan coba lagi");
                break;
        }
    }
}
