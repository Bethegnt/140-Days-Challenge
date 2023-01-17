import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.next();    //  print string name.
        System.out.println("Enter Gender: ");
        char gender = sc.next().charAt(0);  //  print character gender.
        System.out.println("Enter Age: ");
        int age = sc.nextInt(); //  print Age through number.
        System.out.println("Enter Phone Number: ");
        long phone = sc.nextLong(); //  print phone number.
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone No.: "+phone);

    }
}
