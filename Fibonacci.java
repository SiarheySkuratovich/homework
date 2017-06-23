import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) throws IOException {
    Scanner number = new Scanner(System.in);
    int count = number.nextInt();
    final int max = 2147483647;
    int sum;
    int next = 0;
    int previous = 1;
    boolean success = false; 
    while(next < max / 2) {
      sum = next + previous;
      next = previous;
      previous = sum;
        if (count == sum) {
          success = true;
          System.out.println("Your number is count from Fibonacci"); } 
      } if (success == false) {
          System.out.println("Your number is not count from Fibonacci");
      }  
    }
  }
  
    
