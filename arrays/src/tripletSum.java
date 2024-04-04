import java.util.Scanner;
class tripletSum
{
    static int tripletSum(int[] arr,int target)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("array"+n+"element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("target Sum is:");
        int target=sc.nextInt();
        System.out.println(tripletSum(arr,target));
    }
}