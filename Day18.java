public class Day18 {
    public static void main(String[] args) {
        // Tipe data kecil
        byte nilaiByte = 19;
        short nilaiShort;
        int nilaiInt;
        long nilaiLong;

        // Konversi otomatis
        nilaiShort = nilaiByte;   // byte ke short
        nilaiInt = nilaiShort;    // short ke int
        nilaiLong = nilaiInt;     // int ke long

        // Cetak hasil konversi
        System.out.println("Nilai byte   : " + nilaiByte);
        System.out.println("Nilai short  : " + nilaiShort);
        System.out.println("Nilai int    : " + nilaiInt);
        System.out.println("Nilai long   : " + nilaiLong);

    }
}
