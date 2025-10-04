import java.util.Scanner;
public class Day27_Evaluasi1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //Input
        int a = ip.nextInt();
        int b = ip.nextInt();
        
        // Output Soal1
        int Luas = a*b;
        int Keramik = 2*2;
        int Kebutuhan = Luas/Keramik;
        System.out.println(Kebutuhan);
        
        //Output Soal2
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
