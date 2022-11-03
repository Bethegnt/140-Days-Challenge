import java.util.Scanner;

public class methods {


    public static void sum(int a , int b){
        int sum = a+b;
        System.out.println("Sum of the two numbers: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);


    }
}
