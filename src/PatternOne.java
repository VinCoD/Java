public class PatternOne {
    public static void main(String[] args){
        int i, j, row=6;
        for(i=row-1; i>0; i--){
            for(j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }


}
