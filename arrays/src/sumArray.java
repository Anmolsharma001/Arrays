class sum
{
    void sumOfArray()
    {
        int arr[]={1,2,3,6,5};
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
class sumArray
{
    public static void main(String[] args)
    {
      sum obj=new sum();
      obj.sumOfArray();
    }
}