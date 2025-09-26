import java.util.Scanner;
public class D0224508 {   
    public static void main(String[] args) {      
       Scanner ip =new Scanner(System.in);
            System.out.print("Masukkan Nilai :");
            int b =ip.nextInt();

            if(b%2==0){
                System.out.println("Genap");
            }else{
                System.out.println("Ganjil");
            }

            if(b%2==0){
                System.out.println("Angka "+ b +" adalah Genap");
            }else{
                System.out.println("Angka "+ b +" adalah Ganjil");
            }
      }
}
