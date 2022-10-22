import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number 2: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum = "+sum);
       // return 0; Cannot return a value from a method with void result type
    }

}
