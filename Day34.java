public class Day34 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 2;        
        boolean hasil = ((x * y) < (y + z)) && (x != z);       
        System.out.println("Apakah (x * y) < (y + z) dan x tidak sama dengan z ? "+ hasil);
    }
}
