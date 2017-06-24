import java.util.Scanner;

public class Fibonacci {
  private String NotNumber;
  private int count;
public Fibonacci() {
  Scanner number = new Scanner(System.in);
    while (!number.hasNextInt()) {
      System.out.println("It is not a number");
      NotNumber = number.next();
  } if (number.hasNextInt()) {
      NotNumber = number.next();
      count = Integer.parseInt(NotNumber); }
  }
public void fibonacci() {
  boolean success = false;
  int sum;
  int next = 0;
  int previous = 1;
  while (next < count) {
    sum = next + previous;
    next = previous;
    previous = sum;
  if (count == sum) {
    success = true;
    System.out.println("Your number is count from Fibonacci");
    break;
    }       
} if (success == false) {
    System.out.println("It is not a number from Fibonacci");
  }  
}
public static void main(String[] args) {
  Fibonacci f = new Fibonacci();
  f.fibonacci(); }
}
