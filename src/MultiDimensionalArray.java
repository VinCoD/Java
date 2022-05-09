import javax.swing.*;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int i, j;
        int first[][] = new int[10][10];
        int second[][] = new int[10][10];
        int sum[][] = new int[10][10];

//        First Matrix Input
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                first[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter values of first matrix"));


            }
            System.out.println();
        }

//        Second Matrix Input
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                second[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter values of the second matrix"));


            }
            System.out.println();
        }

//        Sum
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                sum[i][j] = first[i][j] + second[i][i];


            }
            System.out.println();
        }
        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                System.out.print(sum[i][j]);
                System.out.print("\t");



            }
            System.out.println();
        }
    }
}
