import java.util.Scanner;
public class Day41_EvaluasiMentor2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Tes Akademik\t:");
        int a = ip.nextInt();
        System.out.print("Tes Pisikologi\t:");
        int b = ip.nextInt();
        System.out.print("Tes Wawancara\t:");
        int c = ip.nextInt();
        ip.nextLine();
        System.out.print("Status Ekonomi\t:");
        String d = ip.next();

        if (a >= 80 && b >= 80 && c >= 80) {
            System.out.println("Diterima Langsung");
        } else if (a >= 70 && b >= 70 && c >= 70 && d.equals("Rendah")) {
            System.out.println("Diterima dengan beasiswa");
        } else if (a < 60 && b >= 60 && c >= 60) {
            System.out.println("Tidak lulus");
        } else if ((a + b + c) / 3 >= 75 && d.equals("Tinggi")) {
            System.out.println("Cadangan");
        } else {
            System.out.println("Ditolak");
        }
    }
}
