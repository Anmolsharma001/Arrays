import java.util.Scanner;
class algebra
{
    int sum(int a,int b)
    {
        int ans=a+b;
        return ans;
    }
}
public class algebraMain
{
    public static void main(String[] args)
    {
      algebra obj=new algebra();
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println("sum of two number is:");
      int ans=obj.sum(x,y);
        System.out.println(ans);
    }
}

