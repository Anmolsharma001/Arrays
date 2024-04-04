class max  //maximum nikalenge
{
    void maxOfArray()
    {
        int arr[]={23,45,6,211,23};
        int ans=0;
        for(int i=0;i<5;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}
class maxArray
{
    public static void main(String[] args)
    {
      max obj=new max();
      obj.maxOfArray();
    }
}