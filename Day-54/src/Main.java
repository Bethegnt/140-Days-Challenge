import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Zero");
        }else {
            String result = num>0?"the number is positive":"this number is negative";
            System.out.println(result);
        }
    }
}
// this is ternary operators.
/*
Ternary Operator Syntax
( Condition ) ? ( if True : Action) : ( if False : Action) ;
*/