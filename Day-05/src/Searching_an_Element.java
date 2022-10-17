import java.util.Scanner;

public class Searching_an_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key;
        System.out.println("Enter a key: ");
        key = sc.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("Element Found at: " + i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}