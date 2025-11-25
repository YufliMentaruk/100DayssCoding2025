import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        //Membuat akun
        System.out.print("Buat Username :");
        String a = ip.nextLine();
        System.out.print("Buat Password :");
        String b = ip.nextLine();

        System.out.println("\n=== LOGIN AKUN ===");
        String inputUser, inputPass;
        //Perulangan login (berhenti jika benar)
        while (true) {
            System.out.print("Username :");
            inputUser = ip.nextLine();
            System.out.print("Password :");
            inputPass = ip.nextLine();

            if (inputUser.equals(a) && inputPass.equals(b)) {
                System.out.println("Login Berhasil!");
                break;
            } else {
                System.out.println("Username atau Password salah! Silahkan Coba lagi.\n");
            }
        }
    }
}
