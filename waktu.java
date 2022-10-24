import java.util.Scanner;
public class waktu {
    public static void main(String[] args) {
        int detik = 3600;
        int menit = 60;
        int jam = 60;
        int hasil;
        Scanner v = new Scanner(System.in);
        System.out.println("[1] detik ke menit\n"+"[2] detik ke jam\n"+"[3] jam ke menit\n"+"[4] jam ke detik\n"+"[5] menit ke detik\n"+"[6] menit ke jam\n");
        System.out.print(">");
        int a = v.nextInt();
        if (a == 1){
            System.out.print("detik: ");
            int d = v.nextInt();
            hasil = d / menit;
            System.out.print("hasil: "+hasil+" menit");
        }else if (a == 2){
            System.out.print("detik: ");
            int d1 = v.nextInt();
            hasil = d1 / detik;
            System.out.print("hasil: "+hasil+" jam");
        }else if(a == 3){
            System.out.print("jam: ");
            int j = v.nextInt();
            hasil = j * menit;
            System.out.print("hasil: "+hasil+" menit");
        }else if(a == 4){
            System.out.print("jam: ");
            int j1 = v.nextInt();
            hasil = j1 * detik;
            System.out.print("hasil: "+hasil+" detik");
        }else if(a == 5){
            System.out.print("menit: ");
            int m = v.nextInt();
            hasil = m * menit;
            System.out.print("hasil: "+hasil+" detik");
        }else if(a == 6){
            System.out.print("menit: ");
            int m1 = v.nextInt();
            hasil = m1 / jam;
            System.out.print("hasil: "+hasil+" jam");
        }

        
    }
}
