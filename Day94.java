import java.util.Scanner;

public class Day94 {
     static void bilangan (){
         Scanner ip = new Scanner(System.in);
         
         System.out.println("Masukkan Nilai :");
         int a = ip.nextInt();
         if (a %2 ==0){
             System.out.println("Bilangan Genap");
         }else{
             System.out.println("Bilangan Ganjil");
         }
     }
     
    public static void main(String[] args) {
        bilangan();
    }
}
