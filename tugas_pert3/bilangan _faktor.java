import java.util.Scanner;
public class bilangan_fuck {
    public static void main(String[] args) {
        int hasil,x;
        Scanner v = new Scanner(System.in);
        System.out.println("input bilangan x: ");
        x = v.nextInt();
        hasil = x;
        x = x-1;
        if (x == 1){
            hasil =  hasil * (x-1);
            System.out.println("hasil: "+hasil);
        }else{
            hasil = hasil * (x-1);
        }
    }
}
