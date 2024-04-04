import java.util.Scanner;
class prefixSum
{
    static void printArray(int[]arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static int[]makePrefixSumArray(int[]arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("input Array");
        printArray(arr);
        int[]pref=makePrefixSumArray(arr);
        printArray(pref);
    }
}