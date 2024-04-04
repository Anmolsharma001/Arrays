class traverseForEach//traversing for each loop in array;
{
    void demoArray()
    {
        int ages[]=new int[5];
        ages[0]=12;
        ages[1]=13;
        ages[2]=14;
        ages[3]=15;
        ages[4]=16;
        for(int age:ages)
        {
            System.out.println(age);
        }
    }
}
class main
{
    public static void main(String[] args)
    {
       traverseForEach obj=new traverseForEach();
       obj.demoArray();
    }
}