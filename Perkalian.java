import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a =ip.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
}
