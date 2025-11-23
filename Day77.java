public class Day77 {
    public static void main(String[] args) {
        String teks = "Hallo Selamat Datang Di java ";

        // substring()
        String sub = teks.substring(0, 13);
        // replace()
        String diganti = teks.replace("java", "C++");
        // trim()
        String rapi = teks.trim();
        System.out.println("substring(2, 9): " + sub);
        System.out.println("replace(): " + diganti);
        System.out.println("trim(): '" + rapi + "'");
    }
}
