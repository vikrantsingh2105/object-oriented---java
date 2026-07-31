import java.util.Scanner;
class Student
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int target;
        int index=-1;
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
        System.out.print("Enter the element u want to search:");
        target=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(arr[i]==target){
                index= i;
                break;
            }
            
        }
        if (index == -1) {
            System.out.println("Element " + target + " is not present in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + index);
        }
            
    }
}

        
       
