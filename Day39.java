import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("<========MENU========>");
        System.out.println("1.Nasi Goreng Spesial");
        System.out.println("2.Ayam Krispi Jumbo");
        System.out.println("3.Es Teh Manis");
        System.out.println("4.Jus Jeruk");
        
        System.out.println("Pilih Menu Diatas:");
        int pilih =ip.nextInt();

        if (pilih == 1) {
            System.out.println("Kamu memilih Nasi Goreng Spesial.");
        } else if (pilih == 2) {
            System.out.println("Kamu memilih Ayam Krispi Jumbo.");
        } else if (pilih == 3) {
            System.out.println("Kamu memilih Es Teh Manis.");
        } else if (pilih == 4) {
            System.out.println("Kamu memilih Jus Jeruk.");
        } else {
            System.out.println("Pilihan tidak ada, silakan Pilih lagi.");
        }
    }
}
