import java.util.Scanner;

public class Product_a_b {
    public static int product(int a,int b) {
//        Scanner sc =  new Scanner(System.in);
//        a= sc.nextInt();
//        b= sc.nextInt();
        int product = a*b;
        System.out.println("Product od the number: "+product);
        return product;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        product(a,b);






    }
}
