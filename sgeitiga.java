import java.util.Scanner;
public class sgeitiga{
    public static void main(String []args){
       int a;
       Scanner v = new Scanner(System.in);
       System.out.println("t: ");
        a = v.nextInt();
        for (int c = 0;c < a;c++){
            for (int d = 0; d < a;d++){
                System.out.print("*");
            }
            System.out.print("\n");

            //for (int d = 0;d < a;d++){
           //     System.out.print("*");  
            //}   
       }
    }
}