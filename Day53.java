public class Day53 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                System.out.println("Perulangan berhenti pada angka " + i);
                break;
            }
            System.out.println("Angka ke-" + i);
        }
    }
}
