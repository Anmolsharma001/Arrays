class children
{
    int age;
    String name;
}
public class childrenMain
{
    public static void main(String[]args)
    {
        children obj1=new children();
        obj1.age=21;
        obj1.name="aanupam";
        System.out.println(obj1.age);
        System.out.println(obj1.name);

        children obj2=new children();
        obj2.age=34;
        obj2.name="diya";
        System.out.println(obj2.age);
        System.out.println(obj2.name);
    }
}