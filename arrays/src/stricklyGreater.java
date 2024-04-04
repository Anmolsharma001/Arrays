//isme greater value batana h jese 1 2 3 4 5 6 to ye true ho jayenga..
//or agr 1 3 4 2 ye sorted nhi h -false aa jayenga....
import java.util.Scanner;
class stricklyGreater
{
    static boolean isSorted(int[] arr)
    {
        boolean check=true;  //humne phle true batayaa h...
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                check =false;
                break;
            }
        }
        return check;
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
        System.out.println("isSorted "+isSorted(arr));
    }
}
