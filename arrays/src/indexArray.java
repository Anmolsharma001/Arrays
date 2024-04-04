class index
{
    void indexOfArray()
    {
        int arr[]={23,45,67,1,7};
        int x=7;
        int ans=-1;
        for(int i=0;i<=4;i++)
        {
            if(arr[i]==x)
            {
               ans=i;
            }
        }
        System.out.println("found"+x+"at index"+ans);
    }
}
class indexArray
{
    public static void main(String[] args)
    {
       index obj=new index();
       obj.indexOfArray();
    }
}