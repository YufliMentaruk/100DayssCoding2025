import java.util.Scanner;
public class SoalLatihan {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
      
        //Soal1
        int a = ip.nextInt();
        int b = ip.nextInt();
        int c=0;
        if(a>=b){
           c=a+b;
           if(c %3 ==0){
               for (int i = 1; i <= c; i++) {
                   for (int j = 1; j <= i; j++) {
                       System.out.print("* ");
                   }
                   System.out.println();
               }
           }else{
               System.out.println(c);
           }
        }else {
            c = a * b;
            if (c % 2 == 0) {
                for (int i = 1; i <= c; i++) {
                    for (int j = 1; j <= c; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println(c);
            }
        }
      

      //Soal2
        String a=ip.nextLine();
        String b=ip.nextLine();
        String c=ip.nextLine();
        System.out.printf(a+":\\"+b+"\\"+c);
    }
}
