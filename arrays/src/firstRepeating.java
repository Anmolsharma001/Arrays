import java.util.Scanner;
class firstRepeating
{
    static int firstRepeatingNumber(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)//first number
        {
            for(int j=i+1;j<n;j++)//second number
            {
                if(arr[i]==arr[j])//found answer
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array"+n+"element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("firstRepeating:"+firstRepeatingNumber(arr));
    }
}