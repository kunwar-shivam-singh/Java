import java.util.Scanner;

public class SwapNo {

public static void main(String args[])
{
System.out.println("Enter 2 no to swap :");
    
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  
  System.out.println("Entered 2 no to swap are: "+a+" and "+b);
  b = a+b;
  a= b-a;
  b= b-a;
  System.out.println("\nAfter swapping the values of two nos is: "+a+" and "+b);
}

}
