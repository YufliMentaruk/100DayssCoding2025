public class Day90 {

    // Method non-void (mengembalikan nilai)
    static int tambah(int a, int b) {
        return a + b; // mengembalikan hasil penjumlahan
    }
    // Memanggil method dan menyimpan nilai kembaliannya
    public static void main(String[] args) {
        int hasil = tambah(5, 7); 
        System.out.println("Hasil penjumlahan adalah: " + hasil);
    }
}
