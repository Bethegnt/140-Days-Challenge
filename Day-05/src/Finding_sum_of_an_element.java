import java.util.Scanner;
public class Finding_sum_of_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int Sum = 0;
        for (int x: A) {
            Sum = Sum + x;
            System.out.println("Sum of an array: "+Sum);



        }
    }
}
