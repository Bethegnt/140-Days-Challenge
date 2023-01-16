import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            a= a+b;
            b= a-b;
            a= a-b;
            System.out.println("a: "+a);
            System.out.println("b: "+b);
    }
}
