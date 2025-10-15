import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka :");
      
        int a = ip.nextInt();
        
         if (a > 0){
         System.out.println("Bilangan Positif");
         } else if (a < 0) {
         System.out.println("Bilangan Negatif");
         }else {
         System.out.println("Bilangan Nol");
        }
    }
}
