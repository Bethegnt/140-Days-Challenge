import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b = sc.nextInt();
        if(a%2==0){
            if(b%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }else {
            System.out.println("even");
        }
//        System.out.println();
    }
}
