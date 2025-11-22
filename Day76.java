import java.util.Scanner;
public class Day76 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String a = ip.next();
        String b = ip.next();
        String c = "";
        // equals()
        System.out.println("equals(): " + a.equals(b));
        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
        // contains()
        System.out.println("contains(\"Hallo\"): " + a.contains("Hallo"));
        // isEmpty()
        System.out.println("isEmpty() pada variabel 'kosong': " + c.isEmpty());
    }
}
