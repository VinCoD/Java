import javax.swing. *;
class MyInput {
    public static void main(String[] args){
        String Y = JOptionPane.showInputDialog("Enter the value of y");
        int y = Integer.parseInt(Y);
        String X = JOptionPane.showInputDialog("Enter the value of x");
        int x = Integer.parseInt(X);
        int z = x+y;
        JOptionPane.showMessageDialog(null, "x + y = " + z);


    }
}

