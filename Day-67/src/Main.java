public class Main {
    int id;
     String name;
     Main(int i, String n){
         id = i;
         name = n;
     }
     Main(String n ,int i){

     }
     void display(){
         System.out.println(id+""+name);

     }
    public static void main(String[] args) {
       Main obj = new Main(5,"kunal");
       Main obj2 = new Main("kunal",6);
       obj.display();
    }
}