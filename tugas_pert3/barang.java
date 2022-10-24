import java.io.*;

import javax.swing.JOptionPane;
public class barang {
    public static void main(String[] args) {
        int j,b,h;

        j = Integer.parseInt(JOptionPane.showInputDialog("jumlah barang: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("harga barang: "));
        if (j > 100){
            h = j * b;
            JOptionPane.showMessageDialog(null, "hasil: "+h);
        }else{
            double h1 =0.90 * j * b ;
            JOptionPane.showMessageDialog(null, "hasil: "+h1);
        }

    }
}
