import java.util.Arrays;
import java.util.Scanner;
class smallestAndLargestArray
{
    static int[] smallestAndLargestArray(int[] arr)
    {
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[]=smallestAndLargestArray(arr);
        System.out.println("smallest"+arr[0]);
        System.out.println("largest"+arr[1]);
    }
}
