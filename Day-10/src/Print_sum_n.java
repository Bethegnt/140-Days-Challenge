import java.util.Scanner;

public class Print_sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.println("Print the number last: ");
        int n = sc.nextInt();
        int sum = 0;
        while(a<=n){
            sum = sum+a;
            a++;

        }
        System.out.println("sum of n number: "+sum);
    }
}
