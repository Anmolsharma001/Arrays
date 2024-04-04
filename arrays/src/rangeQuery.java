
import java.util.Scanner;
class rangeQuery
{
    static int[]makePrefixSumArray(int[]arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[]arr=new int[n+1];
        System.out.println("enter array"+n+"element");
        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int prefSum[]=makePrefixSumArray(arr);
        System.out.println("enter number of queries");
        int q=sc.nextInt();
        while(q-->0) {
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = prefSum[r] - prefSum[l-1];
            System.out.println(sum);
        }
    }
}
