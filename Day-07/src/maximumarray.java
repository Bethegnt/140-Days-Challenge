public class maximumarray {
   static int max() {
       int[] num ={1,2,3,4,5,6,7,8,9};
       int i;
       int max = num[0];
       for (i = 0; i < num.length;i++ )
           if (num[i]>max)
               return max;

   }
    public static void main(String[] args) {
        System.out.println("maximumarray: "+max());
    }
}
