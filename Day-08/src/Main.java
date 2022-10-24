public class Main {
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x , float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    static int max(byte x,byte y)
    {
        return x>y?x:y;
    }

    public static void main(String[] args) {
        System.out.println(max(10,5));
    }
}