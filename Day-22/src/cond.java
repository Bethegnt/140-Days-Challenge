import java.util.Scanner;

public class cond {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("applicable");
        } else{
            System.out.println("not applicable");
        }
    }
}
