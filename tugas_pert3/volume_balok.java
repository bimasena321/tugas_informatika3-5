import java.util.Scanner;
public class volume_balok {
    public static void main(String[] args) {
        int p,l,t,hasil;
        Scanner v = new Scanner(System.in);
        System.out.println("panjang: ");
        p = v.nextInt();
        System.out.println("lebar: ");
        l = v.nextInt();
        System.out.println("tinggi: ");
        t = v.nextInt();

        hasil = p*l*t;
        System.out.print("Volume: "+hasil);


    }
}
