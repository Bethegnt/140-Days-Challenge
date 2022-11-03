public class check_num_prime_not {
    public static boolean prime(int n){
        boolean isprime =true;
        for (int i = 2; i <=n-1 ; i++) {
            if(n%i ==0){
                isprime = false;
            }

        }
        return isprime;

    }
        public static void main (String[] args) {
        prime(11);

    }
}
