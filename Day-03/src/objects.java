import java.util.Scanner;
 class Animal{
        int legs;
        String name;
         void walk(){
             System.out.println(name +" "+ "is walking");
         }
         void walk(int steps){
             System.out.println("Animal walked " +steps+" steps ");
         } // method overloading.
         public Animal(){
             System.out.println("calling the constructor");
         }

         public Animal(String newName){
             System.out.println(newName+"was passed while creating ");
         }
    }

public class objects{
    public static void main(String[]args) {
     Animal a1 = new Animal();
     Animal a2 = new Animal("bob");

     a1.name = "Simba";
     a1.legs = 4;

     a2.name ="BOB";
     a2.legs = 2;
     a1.walk();
     a1.walk(5);
     System.out.println(a1.name + " "+ a1.legs);
    }
   
}
