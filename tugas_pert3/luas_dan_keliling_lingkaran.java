import java.util.Scanner;
public class luas_dan_keliling_lingkaran {
    public static void main(String[] args) {
        int a,b;
        int hasilx;
        double hasilxx,hsk1,hsk2;
        Scanner v = new Scanner(System.in);
        System.out.print("Luas: ");
        a = v.nextInt();
        System.out.print("keliling: ");
        b = v.nextInt();

        hasilx = 22 / 7 * a * a ;
        hasilxx = 3.14 * a * a;
        hsk1 = 22 * b / 7;
        hsk2 = 2 * 3.14 * b;
        System.out.println("Luas1: "+hasilx+"  //kelipatan 7");
        System.out.print("Luas2: "+hasilxx+"  //bukan kelipatan 7");
        System.out.println("\n");
        System.out.println("keliling1: "+hsk1+"  //kelipatan 7");
        System.out.println("keliling2: "+hsk2+"  //bukan kelipatan 7");

    }
}
