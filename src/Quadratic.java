import javax.swing.*;
import java.lang.Math;

class Quadratic {
    public static void main(String[] args){
        String A = JOptionPane.showInputDialog("Enter the value of a");
        int a = Integer.parseInt(A);
        String B = JOptionPane.showInputDialog("Enter the value of b");
        int b = Integer.parseInt(B);
        String C = JOptionPane.showInputDialog("Enter the value of c");
        int c = Integer.parseInt(C);
        double x1, x2;
        double z = ((b*b)-(4*a*c));

        if (z > 0){

            x1 = ((-b + Math.sqrt(z))/(2*a));
            x2 = ((-b - Math.sqrt(z))/(2*a));
            JOptionPane.showMessageDialog(null, "X1 = " + x1 + "\n" + " X2 =" + x2);


        }
        else
            JOptionPane.showMessageDialog(null, "Complex Roots");




    }


}
