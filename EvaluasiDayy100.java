import java.util.Scanner;
public class EvaluasiDayy100 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        //Soal1
        System.out.print("Masukkan Nama Depan : ");
        String namadepan =ip.next();
        System.out.print("Masukkan Nama Belakang : " );
        String namabelakang=ip.next();
        System.out.print("Umur : ");
        int umur= ip.nextInt();
        System.out.print("Tinggi Badan (m) :");
        double tb=ip.nextDouble();
        double tinggi=tb/100;
        System.out.print("Berat Badan (kg) :");
        int berat=ip.nextInt();
        ip.nextLine();
        System.out.print("Perguruan tinggi : ");
        String perguruan=ip.nextLine();

        System.out.println("Halo dunia! Aku "+namadepan+" "+namabelakang+",umur baru "+umur+" tapi \njiwa udah kayak semester akhir. Tinggiku "
                +tinggi+" \nmeter cukup tinggi buat ambil di rak atas, \nberatku "+berat+" kg (jangan nanya kenapa!). \nSekarang aku resmi jadi mahasiswa di \n"
                +perguruan+", doain skripsiku \ngak drama ya!");

        
        //Soal2
        System.out.println("Buat Username : ");
        String user=ip.nextLine();
        System.out.println("Buat Password : ");
        String pas=ip.nextLine();

        String us;
        String ps;
        while (true){
            System.out.println("Masukkan Username : ");
            us=ip.nextLine();
            System.out.println("massukan Password : ");
            ps=ip.nextLine();

            if(us.equals(user) && ps.equals(pas)){
                System.out.println("berhasil login");
                break;
            } else if (us.equals(user) && !ps.equals(pas)) {
                System.out.println("password salah");
            } else if (!us.equals(user) && ps.equals(pas)) {
                System.out.println("username salah.");
            } else {
                System.out.println("gagal login");
            }
        }


        //Soal3
        int angka;
        int totalValid = 0;

        while (true) {
            angka = ip.nextInt();

            if (angka == 18) {
                System.out.println("Total " + totalValid +
                        " angka valid dimasukkan dan Ujian Selesai, Terima Kasih!");
                break;
            }

            if (angka < 10 || angka > 80) {
                System.out.println("Angka Tidak Valid, Anda Kurang Literasi!");
            } else if (angka >= 10 && angka <= 50) {
                System.out.println("Angka " + angka);
                totalValid++;
            } else {
                System.out.println("Angka Tidak Valid, Anda Kurang Literasi!");
            }
        }

        
        //Soal4
        int a = ip.nextInt();
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        //Soal5
        double x=ip.nextInt();
        double y=ip.nextInt();

        double p=x+y;
        double q;

        if(p >= 4){
            q = x / y;
        }else {
            q = x * y;
        }
        System.out.println(q);


    }
}
