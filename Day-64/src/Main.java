public class Main {
      protected Object show(){
        System.out.println("fun1");
        return null;
    }
public static class Main2 extends Main{
          protected String show(){
            System.out.println("fun2");
            return null;
        }
}
    public static void main(String[] args) {
          Main obj = new Main();
          obj.show();
          Main2 cv = new  Main2();
          cv.show();

    }
}
// child class ka access modifier bada hona chahiye parent class se !!!