import java.util.Scanner;
public class Day55_Evaluasi2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        //Soal1
        int bawah =ip.nextInt();
        int atas  =ip.nextInt();
        int bulat =ip.nextInt();

        if(bulat > bawah && bulat < atas){
            System.out.println("YAYAYA");
        }else{
            System.out.println("NONONO");
        }

        //Soal2
        int nilai =ip.nextInt();

        if(nilai > 70 ){
            System.out.println("Ujian Kroco Ji Pale");
        }else{
            System.out.println("Sa Jappo'ka Aih");
        }

        //Soal3
        int angka =ip.nextInt();

        if(angka %2 == 0){
            System.out.println("Iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}
