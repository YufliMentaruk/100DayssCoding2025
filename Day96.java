public class Day96 {
    static double operator(double a, double b) {
        System.out.println("Hasil dari "+a+" + "+b+" = "+(a+b));
        System.out.println("Hasil dari "+a+" - "+b+" = "+(a-b));
        System.out.println("Hasil dari "+a+" * "+b+" = "+(a*b));
        System.out.print("Hasil dari "+a+" / "+b+" = ");
        return (a/b);
    }
    public static void main(String[] args) {
        double hasil=operator(30,4);
        System.out.println(hasil);
    }
}
