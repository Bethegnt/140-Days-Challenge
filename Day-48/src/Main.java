import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the desired number: ");
        int n = sc.nextInt();
        int num = 1;
       // int res ;
        for (num =1;num<=10;num++){
           //res = n*num;
            System.out.println(n+"*"+num+"="+n*num);
        }

    }
}