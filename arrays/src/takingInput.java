import java.util.Scanner;
class takingInput
{
    public static void main(String[] args)
    {
        System.out.println("enter the size of an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("array"+n+"element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}