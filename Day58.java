import java.util.Scanner;
public class Day58{
  public static void main(Strong[] args) {
    Scanner ip = new Scanner(System.in);

  System.out.print("Masukkan Angka :");
    int N =ip.nextInt();

  for (int i =1; i <= N; i++){
    System.out.print(i) ;
  }
System.out.prinln();
  for (int i =N; i >= 1; i--){
    System.out.print(i) ;
  }
System.out.println();

  }
}
