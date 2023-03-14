public class Main {
    int id;
    String name;
    void display(){
        System.out.println(id+""+name);
    }
    public static void main(String[] args)
    {
       // creating objects:
        Main s1 = new Main();
        s1.display();
    }
}