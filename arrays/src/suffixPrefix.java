import java.util.Scanner;
class suffixPrefix
{
    static int findArray(int[]arr)
    {
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalPartition(int[]arr)
    {
        int totalSum=findArray(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partition"+equalPartition(arr));
    }
}