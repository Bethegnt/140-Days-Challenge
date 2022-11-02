package Enter_no;

import java.util.Scanner;

public class _except_multiple_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Print a number: ");
            int a = sc.nextInt();
            if (a % 10 == 0) {
                continue;
            }
            System.out.println("number was: "+a);
        }while(true);

        }
    }

