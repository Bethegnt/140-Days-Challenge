
class Person{
    String name;
    int age;
    static int count;
    public  Person(){
        count++;
        System.out.println("person is being created");
    }
//    Person(String newName, int newAge){
//        name = newName;
//        age = newAge;
//    } this is old factor which is used for the new name
    Person(String name, int Age){
        this();
        this.name = name;
        this.age = age;
        walking(this);
    }
    void walking(Person obj){
        System.out.println(name+ "is walking");
        age +=10;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gagan",25);
        System.out.println(p1.name+ " "+p1.age);
        System.out.println(Person.count);
    }
}