public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);

    }
    static void pattern3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

