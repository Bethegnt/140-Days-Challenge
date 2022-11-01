public class Print_reverse_given_no {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while (n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n/=10;
        }
        System.out.print(rev);
    }
}
