import java.util.Scanner;
public class uang {
    public static void main(String[] args) {
        double rupiah = 15.537;
        float peso = 2500,yen = 4000,dollar = 8250;
        float hasil,hasil1,hasil2;
        Scanner v = new Scanner(System.in);
        System.out.print("nilai dolar: ");
        float d = v.nextFloat();
        System.out.print("nilai yen: ");
        float y = v.nextFloat();
        System.out.print("nilai peso: ");
        float p = v.nextFloat();

        hasil =  d / dollar;
        hasil1 = y / peso;
        hasil2 = p / yen;
        System.out.print("dolar: "+hasil+"\n");
        System.out.print("yen: "+hasil1+"\n");
        System.out.print("peso: "+hasil2+"\n");
    }
}
