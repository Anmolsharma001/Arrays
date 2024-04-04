import java.util.Scanner;
class lastOccurence
{
    static int lastOccurence(int[] arr,int x)
    {
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    static int countOccurence(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array"+n+"elment");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the X:");
        int x=sc.nextInt();
        System.out.println("countOccurence"+countOccurence(arr,x));
        System.out.println("lastOccurence"+lastOccurence(arr,x));
    }
}