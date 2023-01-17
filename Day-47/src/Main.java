import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fun;
       do { Scanner sc = new Scanner(System.in);
           System.out.println("Enter the first number: ");
           int a = sc.nextInt();
           System.out.println("Enter the second number: ");
           int b = sc.nextInt();
           int res;
           System.out.println("operator: Add-A,Sub-S,Mul-M,Div-D: ");
           char operator = sc.next().charAt(0);
// Choose the operator
           switch (operator){
// Addition of the desired number:
               case 'A':
                   res = a+b;
                   System.out.println("Add: "+res);
                   break;
// Subtraction of the desired number:
               case 'S':
                   res = a-b;
                   System.out.println("Sub: "+res);
                   break;
// Multiply of the desired number:
               case 'M':
                   res = a*b;
                   System.out.println("Mul: "+res);
                   break;
// Division of the desired number:
               case 'D':
                   res = a%b;
                   System.out.println("Div: "+res);
                   break;
// default value if you cant press the right operator.
               default:
                   System.out.println("didn't choose any operator for further result.");
           }
           System.out.println("Do you want to continue(Press Yes or No) ");
           fun =sc.next();

       }while(fun.equals("yes")||fun.equals("Yes"));
       // equals function use for upper case or lower case anything press the ans should same.


    }
}