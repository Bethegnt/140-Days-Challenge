import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
      Alien obj = new Alien();
//      obj.legs = 3;
        obj.speak();

    }
}
      class Alien{
    static boolean isMemberOfEarth = false;
    int legs;
    void speak(){
        System.out.println("Alien speak");
    }
    void sayHello(){
          System.out.println("alien says hello");
      }

}








