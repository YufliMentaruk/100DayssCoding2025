public class Day91 {
    // Method dengan parameter
    static void Hello(String nama, int umur) {
        System.out.println("Halo " + nama + ", umur kamu " + umur + " tahun.");
    }
    // Memanggil method dengan mengirim 2 parameter
    public static void main(String[] args) {
        Hello("Aldi", 21);
        Hello("Aulia", 20);
    }
}
