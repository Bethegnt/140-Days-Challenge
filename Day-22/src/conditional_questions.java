public class conditional_questions {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if(boolean Expressions T or F){
               //body
            } else {
               //do this
            }
       */
        int salary = 25000;
        if (salary >10000) {
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }
}
