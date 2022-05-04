import javax.swing.*;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int i, j;
        int first[][] = new int[10][10];
        int second[][] = new int[10][10];
        int sum[][] = new int[10][10];
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                first[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter values"));


            }
            System.out.println();
        }
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print(first[i][j]);


            }
            System.out.println();
        }
    }
}
