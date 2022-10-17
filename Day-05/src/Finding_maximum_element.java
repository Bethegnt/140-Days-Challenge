import java.util.Scanner;

public class Finding_maximum_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A[] = {12,13,111,123,345,6545,34243};
        int max = A[0];

        for (int i = 0; i <A.length ; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println(max);

    }
}
