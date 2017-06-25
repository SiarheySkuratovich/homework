import java.util.Scanner;
import java.util.ArrayList;

public class Sequence {
  private String text;
  private Integer count;
  private String answer;
  private boolean cont;
  private ArrayList<Integer> AL;
  private Scanner number; 
  public boolean again() {
    String yes = "y";
    number = new Scanner(System.in);
    System.out.println("Wish you continue, so input y? ");
    answer = number.next();
    if (answer.equals(yes)) {
      return true;
  } else {
      return false; 
    }
  } 

public void input() {
 while (!number.hasNextInt()) {
 System.out.println("It is not a count");
 text = number.next();
 } 
 if (number.hasNextInt()) {
   text = number.next();
   count = Integer.parseInt(text);
   }
 }

public Sequence() {
  AL = new ArrayList<Integer>();
  number = new Scanner(System.in);
}

public void toArray() {
  AL.add(count);
}

public void check() {
  boolean b = true;
  for (Integer I: AL) {
    System.out.print(I + "  ");
    }
  int j; 
  for (j = 0; j < (AL.size() - 1); j++) {
  if (AL.get(j) > AL.get(j + 1)) {
    b = false;
    System.out.println("Not all elements is more then previous");
    break;
    }
  }
  if (b == true) {
    System.out.println("All elements is more then previous  or equal");
    }
  }

public static void main (String[] args) {
  boolean ans = false;
  Sequence S = new Sequence();      
  do {
    S.input();
    S.toArray();
    ans = S.again();
  } while (ans == true);
  S.check();
  }
}
