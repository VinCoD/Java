import javax.swing.*;

public class Circle {
    static double PI = 3.14;
    static double radius;
    Circle(double r){
        radius = r;
    }
    static double Area(){

        return PI * radius * radius;
    }
    static double Circumference(){
        return PI * (radius+radius);
    }
    public static void main(String[] args){
        String R = JOptionPane.showInputDialog("Enter the radius");
        double r = Integer.parseInt(R);
        Circle MyCircle = new Circle(r);
        JOptionPane.showMessageDialog(null, MyCircle.Area() + "\n" + MyCircle.Circumference());
    }
}
