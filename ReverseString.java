import java.util.*;

public class ReverseString{
public static void main(String args[])
{
System.out.println("Enter a word to reverse :");
    
  Scanner sc = new Scanner(System.in);
  String word = sc.nextLine();
  String rword ="";
  if(word == null)
  throw new IllegalArgumentException("Null is not valid input");
 int length = word.length();
 for (int i=length - 1 ;i>=0 ;i--){
rword = rword + word.charAt(i);
 }
System.out.print("\nReverse of the string "+rword+"\n");
}
}
