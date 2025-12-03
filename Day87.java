import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int angka[] ={1,2,3,4,5,6};
        System.out.println("Masukkan angka yang dicari :");
        int cari =ip.nextInt();
        boolean a = false;

        for (int i = 0; i < angka.length; i++) {
            if(angka[i] == cari){
                a = true;
                break;
            }
        }
        if (a){
            System.out.println(a + "\nDitemukan");
        }else{
            System.out.println(a + "\nTidak Ditemukan");
        }
    }
}
