import java.util.Scanner;
class Abc 
{
    public static void main (String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        
        System.out.println("Enter first number");
        a=sc.nextInt();
        
        System.out.println("Enter second number");
        b=sc.nextInt();
        
        System.out.println("Addition = " +(a+b));
        System.out.println("Subtraction = " +(a-b));
    }
}
