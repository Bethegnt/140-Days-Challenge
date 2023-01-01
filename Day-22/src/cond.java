import java.util.Scanner;

public class cond {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    public static void main(String[] args) {
       cond a1 = new cond();
       a1.age;
        if (age >= 18) {
            System.out.println("applicable");
        } else{
            System.out.println("not applicable");
        }
    }
}
