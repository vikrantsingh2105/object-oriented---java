import java.util.Scanner;
class Student
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          System.out.println("Array elemnets are");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            sum=arr[i]+sum;
          
        }
        System.out.println("Sum of the elements of array is :" + sum);
        
        System.out.println("Average of array elements is: " +(double)sum/n);
    }
}
