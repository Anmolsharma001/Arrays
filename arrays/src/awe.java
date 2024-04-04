class awer
{
    void arrayG()
    {
        int[] arr=new int[3];
        arr[0]=12;
        arr[1]=23;
        arr[2]=34;
        for(int age:arr)
        {
            System.out.println(age);
        }
    }
}
class awe
{
    public static void main(String[] args)
    {
       awer obj=new awer();
       obj.arrayG();
    }
}