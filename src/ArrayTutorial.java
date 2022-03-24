import javax.swing. *;
class ArrayTutorial {
    public static void main(String[] args){
        int Numbers[] = new int[10];
        for(int i = 0; i<10; i++){
            String NUM = JOptionPane.showInputDialog("Enter a number");
            int num = Integer.parseInt(NUM);
            Numbers[i] = Numbers[i] + num;


        }
        for(int j = 0; j<10; j++){
            System.out.println(Numbers[j]);
        }

        System.out.println("The array length is : " + Numbers.length);
    }
}

