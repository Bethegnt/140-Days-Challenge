public class Main {
    int id;
    String studentname;
    String studentcity;
    public Main(){
        this(23,"amar","paris");
        System.out.println("this is non parametrized constructor");

    }
    public Main(int st){
        System.out.println(" this is constructor parametrized");
    }
    public Main(int i,String studentcity, String studentname){
        this.studentname = studentname;
       this.studentcity = studentcity;

    }

    }
}