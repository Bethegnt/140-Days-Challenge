import java.util.Scanner;

public class Break_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your Number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        }while(true);



    }
}
