import java.util.Scanner;

public class Fibonacci {
  public static void main (String[] args) {
    String text;
    int count = 0;
    Scanner number = new Scanner(System.in);
    text = number.next();
      try {
        count = Integer.parseInt(text); 
      } catch(NumberFormatException e) {
        System.out.println("It is not a count");
        System.exit(0); 
      }
    final int max = 2147483647;
    boolean success = false;
    int sum;
    int next = 0;
    int previous = 1;
      while (next < max / 2) {
        sum = next + previous;
        next = previous;
        previous = sum;
          if (count == sum) {
            success = true;
            System.out.println("Your number is count from Fibonacci");
            break; 
          }       
        } if (success == false) {
            System.out.println("Your number is not count from Fibonacci");
        }
      }
    }
  
    
