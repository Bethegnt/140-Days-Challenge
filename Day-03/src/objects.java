import java.util.Scanner;
 class Animal{
        int legs;
        String name;
    }

public class objects{
    public static void main(String[]args) {
     Animal a1 = new Animal();
     Animal a2 = new Animal();   

     a1.name = "Simba";
     a1.legs = 4;

     a2.name ="BOB";
     a2.legs = 2;
     System.out.println(a1.name + " "+ a1.legs);
    }
   
}