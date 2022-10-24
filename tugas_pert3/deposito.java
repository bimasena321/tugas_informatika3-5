import java.util.Scanner;
public class deposito {
    public static void main(String[] args) {
        int u,m,l;
        int b = 22 / 100;
        Scanner v = new Scanner(System.in);
        System.out.println("jumlah awal: ");
        m = v.nextInt();
        System.out.println("lama tahun: ");
        l = v.nextInt();
        
        u = m * (1+b)*l;
        System.out.println("hasil: Rp."+u);
        
    }
}

