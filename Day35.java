import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int nilai =ip.nextInt();

        if(nilai >= 75){
            System.out.println("Kamu lulus");
        }else {
            System.out.println("Kamu tidak lulus");
        }
    }
}
