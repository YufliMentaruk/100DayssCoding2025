import java.util.Scanner;
public class Day47 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan Angka Hari (1-7): ");
        int hari = ip.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari ini Senin");
                break;
            case 2:
                System.out.println("Hari ini Selasa");
                break;
            case 3:
                System.out.println("Hari ini Rabu");
                break;
            case 4:
                System.out.println("Hari ini Kamis");
                break;
            case 5:
                System.out.println("Hari ini Jumat");
                break;
            case 6:
                System.out.println("Hari ini Sabtu");
                break;
            case 7:
                System.out.println("Hari ini Minggu");
                break;
            default:
                System.out.println("Hari tidak valid, Silahkan pillih yang lain ");
                break;
        }
    }
}
