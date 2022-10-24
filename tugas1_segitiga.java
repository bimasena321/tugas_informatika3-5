import java.util.Scanner;
public class tugas1_segitiga {
    public static void main(String[] args) {
        int alas,tinggi,hasil;
        
        Scanner v = new Scanner(System.in);
        System.out.println("alas: ");
        alas = v.nextInt();
        System.out.println("tinggi: ");
        tinggi = v.nextInt();

        hasil = 1 * alas * tinggi / 2;

        System.out.print("Luas: "+hasil);


        
    }
}
