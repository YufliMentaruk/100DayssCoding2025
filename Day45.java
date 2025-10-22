import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Pilih Role");
        System.out.println("1.Gold");
        System.out.println("2.Roam");
        System.out.println("3.Mid");
        System.out.println("4.Jugler");
        System.out.println("5.Exp\n");

        System.out.print("Silahkan Pilih Role\t:");
        int Role =ip.nextInt();

        switch (Role){
            case 1:
                System.out.println("Kamu Memilih Gold");
                break;
            case 2:
                System.out.println("Kamu Memilih Roam");
                break;
            case 3:
                System.out.println("Kamu Meilih Mid");
                break;
            case 4:
                System.out.println("Kamu Memilih Jugler");
                break;
            case 5:
                System.out.println("Kamu Memilih Exp");
                break;
            default:
                System.out.println("Role yang kamu pilih tidak ada");
        }
    }
}
