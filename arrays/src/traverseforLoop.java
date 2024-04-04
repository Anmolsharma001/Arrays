class traverseforLoop//traversing for loop;
{
    void demoArray()
    {
        int[]ages=new int[4];
        ages[0]=23;
        ages[1]=34;
        ages[2]=44;
        ages[3]=54;
        for(int i=0;i<=3;i++)
        {
            System.out.println(ages[i]);
        }
    }
}
class traverse
{
    public static void main(String[] args)
    {
      traverseforLoop obj=new traverseforLoop();
      obj.demoArray();
    }
}