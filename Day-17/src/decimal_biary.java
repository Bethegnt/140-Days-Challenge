public class decimal_biary {
    public static void dectobin(int n){
//        int remainder;
        int myNum = n;
        int Pow=0;
        int binnum = 0;
        while(n>0){
            int remaider =n%2;
            binnum = binnum +(remaider*(int)Math.pow(10 ,Pow));
            Pow++;
            n = n/2; // Quotient nikal rhe hai yahn
        }
        System.out.println("binary form of "+n+ " = "+ binnum);

    }
    public static void main(String[] args) {
        dectobin(7);

    }

}
