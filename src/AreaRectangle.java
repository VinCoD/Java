import javax.swing.*;

public class AreaRectangle {
    int length;
    int width;
    public AreaRectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int calculateArea(){
        return this.length* this.width;
    }
    static void inputValues(){
        this.length = Integer.parseInt(JOptionPane.showInputDialog("Enter length"));
        this.width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
    }

    public static void main(String[] args){
        inputValues();
        AreaRectangle myRectangle = new AreaRectangle(l, w);
        AreaRectangle myRectangle1 = new AreaRectangle(90, 10);
        int result = myRectangle.calculateArea();
        int result1 = myRectangle1.calculateArea();
        System.out.println(result);
        System.out.println(result1);
    }
}

