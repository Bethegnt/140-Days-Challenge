import java.util.Scanner;

public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
