import java.util.Scanner;
public class Day69_EvaluasiMentor3{
  public static void main(String[]args){
   Scanner ip = new Scanner(System.in);
     System.out.print("Masukkan panjang: ");
        int a =ip.nextInt();
        int []b=new int[a];

        for (int i = 0; i < b.length; i++) {
            System.out.println("Masukkan angka: ");
            b[i]=ip.nextInt();
        }
        for (int i = b.length -1; i >=0 ; i--) {
           if(i != 0){
               System.out.print(b[i]+", ");
           }else{
               System.out.print(b[i]);
           }
        }
    }
}
