public class multilevel_inhrtnce {
    void level1(){
        System.out.println("This is level 1 from multilevel inheritance");
    }
    void level2(){
        System.out.println("this is level 2 from multilevel inheritance");
    }
 static class multilevel2 extends multilevel_inhrtnce{
        void level3(){
            System.out.println("this is level 3 form multilevel inheritance");
        }
        void level4(){
            System.out.println("this is level 4 from multilevel inheritance");
        }
//    public static void main(String[] args) {
//        multilevel2 obj = new multilevel2();
//       // multilevel_inhrtnce obj = new multilevel_inhrtnce();
//        obj.level2();
//        obj.level1();
//        obj.level3();
//        obj.level4();
//    }
 static class multilevel3 extends multilevel2{
            void level5(){
                System.out.println("this is level5 from multilevel inheritance");
            }
            void level6(){
                System.out.println(" this is level 6 form multilevel inheritance");
            }

     public static void main(String args[]){
            multilevel3 obj = new multilevel3();
            obj.level2();
            obj.level5();
            obj.level6();
            obj.level1();
            obj.level4();
            obj.level3();
        }
 }
}
}
// this is example of multilevel inheritance.