import java.util.Scanner;
class Calculator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        int n1,n2,choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        
        System.out.println("enter the first no");
        n1=sc.nextInt();
        System.out.println("enter the second no");
        n2=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                int result1=n1+n2;
                System.out.println( "value is:" +result1);
                break;
                
            case 2:
                int result2=n1-n2;
                System.out.println( "value is:" +result2);
                break;
                
            case 3:
                int result3=n1*n2;
                System.out.println( "value is:" +result3);
                break;
                
            case 4:
                if(n2==0){
                    System.out.println("second number cannot be equal to 0");
                }
                else{
                System.out.println( "value is:" +(double)n1/n2);
                }
                break;    
                
            default:
                System.out.println("please enter valid choice");
                sc.close();
        }
    }
}
