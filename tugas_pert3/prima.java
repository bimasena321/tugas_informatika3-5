import java.util.Scanner;
public class prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
    System.out.println("##  Program Java Cek Bilangan Prima  ##");
    System.out.println("=======================================");
    System.out.println();
    
    int n,i;
    boolean angka_prima = true;
    
    System.out.print("Input sebuah angka bulat: ");
    n = input.nextInt();
    
    // 0 dan 1 bukan angka prima
    if (n == 0 || n == 1) {
      angka_prima = false;
    }
    else {
      for (i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          angka_prima = false;
          break;
        }
      }
    } 
    
    if (angka_prima)
      System.out.println( n + " adalah angka prima");
    else
      System.out.println( n + " bukan angka prima");
    }
}
