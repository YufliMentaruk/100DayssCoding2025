import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        System.out.print("Masukkan Nilai :");
        int a =ip.nextInt();

        if (a%2==0){
            System.out.println("Genapa");
        }else{
            System.out.println("Ganjil");
        }
    }
}
