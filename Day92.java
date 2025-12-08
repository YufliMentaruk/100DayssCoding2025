public class Day92 {
    // Mengembalikan hasil pengurangan menggunakan return
    static int kurang(int x, int y) {
        return x - y;
    }
    // menangkap nilai yang dikembalikan
    public static void main(String[] args) {
        int hasil = kurang(10, 7);
        System.out.println("Hasil pengurangan :" + hasil);
    }
}
