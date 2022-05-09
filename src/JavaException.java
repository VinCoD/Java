public class JavaException {
    public static void main(String[] args){
        try{
            int value = 20/1;
            System.out.println(value);
        }
        catch(Exception e){
            System.out.println("Can't divide by zero");
        }

    }
}
