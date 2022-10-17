import java.util.Scanner;

public class Finding_Second_Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {1,12,23,34,45,56,67,78,89};
        int max2,max1;
        max1=max2 = A[0];
        for (int i = 0; i <A.length; i++) {
            if (A[i] >max1) {
                max2=max1;
                max1=A[i];

            }else if (A[i]>max1)
            {
                max2=A[i];
            }
        }
        System.out.println("Second largest Element is "+max2);
    }
}
