import java.util.Scanner;
public class PrefixSuffixSum
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
    static boolean equalSumPartition(int[]arr) {
        int totalSum = findArray(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum == prefixSum)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partition:"+equalSumPartition(arr));
    }
    }

