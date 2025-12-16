import java.util.*;

public class Day100 {

    static int[] arrayBaru;   // array hasil retasan

    // ===============================
    // FUNGSI RETAS
    // ===============================
    static int retas(int[] arr) {
        int n = arr.length;
        arrayBaru = new int[n];
        Arrays.fill(arrayBaru, -1); // -1 menandakan kosong

        int p = 0; // total pergeseran

        for (int x : arr) {
            int idx = x % n;

            // jika slot penuh, geser ke kanan
            while (arrayBaru[idx] != -1) {
                idx = (idx + 1) % n;
                p++;
            }

            arrayBaru[idx] = x;
        }
        return p;
    }

    // ===============================
    // FUNGSI SUSUN KODE
    // ===============================
    static String susunKode(int p) {
        StringBuilder sb = new StringBuilder();

        // gabungkan semua angka di array baru
        for (int x : arrayBaru) {
            sb.append(x);
        }

        // ambil p digit pertama
        return sb.substring(0, Math.min(p, sb.length()));
    }

    // ===============================
    // MAIN
    // ===============================
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = ip.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println("Total pergeseran (p): " + p);
        System.out.println("Kode sandi: " + kode);
    }
}
