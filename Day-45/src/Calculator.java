import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        int result;
        System.out.println("Print the first value: ");
        int num1 = sc.nextInt();
        System.out.println("Print the second value: ");
        int num2 = sc.nextInt();
        System.out.println("Please Select the function: ");
        System.out.println("Addition-a: , Subtraction-s: , Multiply-m: , Divide-d: ");
        operator = sc.next().charAt(0);
        switch (operator){
            case 'a' :
                System.out.println("Sum of the given two numbers: "+(num1+num2));
                break;
            case 's' :
                System.out.println("Subtract of the given numbers: "+(num1-num2));
                break;
            case 'm' :
                System.out.println("Multiply of the given numbers: "+(num1*num2));
                break;
            case 'd' :
                System.out.println("Divide of the given numbers: "+(num1%num2));
                break;
            default:
                System.out.println("invalid option");
        }

    }
}
