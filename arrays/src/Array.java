class ArrayExamples
{
    void demoArrays()
    {
        int[] ages=new int[5];
        ages[0]=12;
        ages[1]=34;
        ages[2]=45;
        ages[3]=43;
        ages[4]=67;
        System.out.println(ages.length);
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
    }
}
public class Array
{
    public static void main(String[] args) {
        ArrayExamples obj=new ArrayExamples();
        obj.demoArrays();
    }
}