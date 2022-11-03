public class binomial_coefficient {
    public static int bicoeff(int n , int r){
        int fact_n = Factorial_n.factorial(n);
        int fact_r = Factorial_n.factorial(r);
        int fact_nmr = Factorial_n.factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;


    }

    public static void main(String[] args) {
        System.out.println(bicoeff(5,2));
    }
}
