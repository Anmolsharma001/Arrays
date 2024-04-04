import java.util.Scanner;
class swapWithoutTemp
{
    static void swapWithoutTemp(int a,int b)
    {
        System.out.println("original value before");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value after swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[]args)
    {
        int a=45;
        int b=23;
        swapWithoutTemp(a,b);
    }
}