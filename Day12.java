import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Input teks
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        // Input bilangan bulat
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        // Input bilangan pecahan
        System.out.print("Masukkan tinggi badan : ");
        double tinggi = input.nextDouble();

        //Mencetak output
        System.out.println("\n=== BIODATA SAYA ===");
        System.out.println("Nama  :"+ nama);
        System.out.println("Umur  :"+ umur);
        System.out.println("Tinggi :"+ tinggi);
    }
}
