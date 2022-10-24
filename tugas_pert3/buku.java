import java.util.Scanner;
public class buku {
    public static void main(String[] args) {
        char pinjam;
        char a;
        Scanner v = new Scanner(System.in);
        System.out.println("perlu buku bacaan: (y/t)");
        pinjam = v.next().charAt(0);
        if (pinjam == 'y') {
            System.out.print("beli buku bacaan:(y/t)");
            a = v.next().charAt(0);
            if (a == 'y'){
                System.out.print("membeli buku bacaan: (y/t)");
                char b = v.next().charAt(0);
            
                if (b == 'y') {
                    System.out.println("baca buku yang diinginkan");
                }
            }else{
                System.out.print("pinjam: (y/t)");
                char pp = v.next().charAt(0);
                if (pp == 'y'){
                    System.out.print("baca buku yang diinginkan");
                }
            }
        }
    }
            
        
        
    }
