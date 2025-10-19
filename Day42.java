import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = ip.nextDouble();
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = ip.nextDouble();
        double potongan = 8/100.0;
        
        double gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("Gaji Pokok   : " + gajiPokok);
        System.out.println("Tunjangan    : " + tunjangan);
        System.out.println("Potongan     : " + potongan);

        System.out.println("Gaji Bersih  : " + gajiBersih);
    }
}
