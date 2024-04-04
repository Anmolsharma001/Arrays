import java.util.Scanner;
class presentQuery
{
    static int[] makeFrequencyArray(int[]arr)
    {
        int[] freq=new int[100005];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[]freq=makeFrequencyArray(arr);
        System.out.print("enter number of queries");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.print("enter number to searched");
            int x=sc.nextInt();
            if(freq[x]>0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
            q--;
        }
    }
}

