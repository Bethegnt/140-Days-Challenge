public class Numberisprime {
    static boolean  prime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(21));
    }
}
