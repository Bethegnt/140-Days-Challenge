import java.util.Scanner;
public class Product_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Product of the two numbers:"+c);
        return;
    }
}
