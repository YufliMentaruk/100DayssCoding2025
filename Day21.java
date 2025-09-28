public class Day21 {
    public static void main(String[] args) {
        int a = 14;
        int b = 19;
        System.out.println("Sebelum ditukar: \na = "+ a +"\nb = "+ b);

        // Proses tukar tanpa menggunakan variabel tambahan
        a = a + b; // sekarang a  berisi jumlah a+b
        b = a - b; // b berisi nilai asli a
        a = a - b; // a berisi nilai asli b
        System.out.println("\nSetelah ditukar: \na = "+ a +"\nb = "+ b);
    }
}
