import java.util.Scanner;

public class largestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Largest the two number in it:");
        if (a < b) {
            System.out.println(b);
        }
        else
            System.out.println(+a);

    }
}
