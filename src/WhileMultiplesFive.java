class WhileMultiplesFive {
    public static void main(String[] args){
        int i =0;
        int sum = 0;
        while(i<=100){
            sum += i;
            i += 5;
        }
        System.out.println(sum);
    }
}
