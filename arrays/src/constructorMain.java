class constructor
{
    int a;
    int b;
    constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    int add()
    {
        int ans=a+b;
        return ans;
    }
    int sub()
    {
        int ans=a-b;
        return ans;
    }
    int multi()
    {
        int ans=a*b;
        return ans;
    }
    int div()
    {
        int ans=a/b;
        return ans;
    }
}
public class constructorMain
{
    public static void main(String[] args) {
        constructor obj=new constructor(12,5);
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.multi());
        System.out.println(obj.div());
    }
}