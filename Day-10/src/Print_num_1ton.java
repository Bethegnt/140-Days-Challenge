import java.util.Scanner;

public class Print_num_1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number: ");
        int a=0;
        int n = sc.nextInt();
        while(a<=n){
            System.out.println("Print the all number till n: "+a);
            a++;
        }
    }
}
