public class Day78 {
    public static void main(String[] args) {
        String teks = "Hallo Selamat Datang Di java";

        // length(Menghitung jumlah karakter dalam string)
        int panjang = teks.length();

        // toUpperCase(Mengubah seluruh huruf menjadi huruf besar)
        String besar = teks.toUpperCase();
        // toLowerCase(Mengubah seluruh huruf menjadi huruf kecil)
        String kecil = teks.toLowerCase();

        // trim(Menghapus spasi di awal dan akhir String.)
        String rapi = teks.trim();

        // substring(Mengambil sebagian teks berdasarkan indeks)
        String potong = teks.substring(7, 13);

        // replace(Mengganti kata atau karakter tertentu dengan yang baru)
        String ganti = teks.replace("Java", "C++");

        // contains(Memeriksa apakah sebuah teks mengandung kata tertentu.)
        boolean Kata = teks.contains ("Java");

        System.out.println("Teks asli\t\t:" + teks );
        System.out.println("Panjang teks\t:" + panjang);
        System.out.println("Uppercase\t\t:" + besar);
        System.out.println("Lowercase\t\t:" + kecil);
        System.out.println("Trim\t\t\t:" + rapi );
        System.out.println("Substring\t\t:" + potong);
        System.out.println("Replace\t\t\t:" + ganti);
        System.out.println("Contains\t\t:" + Kata);
    }
}
