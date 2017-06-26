import java.util.Scanner;
import java.util.ArrayList;
/** 
 * To determine the positive sequence. 
 */
public class Sequence {
  private String text;
  private Integer number;
  private String answer;
  private ArrayList<Integer> AL;
  private Scanner Input; 
/** 
 * To re-query the data. 
 */
public boolean again() {
  String yes = "y";
  Input = new Scanner(System.in);
  System.out.println("Wish you continue, so input y? ");
  answer = Input.next();
  return answer.equals(yes);
  }
} 
/** 
 * To verify input data. 
 */
public void input() {
  while (!number.hasNextInt()) {
  System.out.println("It is not a count");
  text = Input.next();
  } 
  if (Input.hasNextInt()) {
    text = Input.next();
    count = Integer.parseInt(text);
    }
  }
/** 
 * For an array with an undefined number of values. 
 */
public Sequence() {
  AL = new ArrayList<Integer>();
  Input = new Scanner(System.in);
}

public void toArray() {
  AL.add(number);
}
/** 
 * Check for affiliation with positive sequence. 
 */
public void check() {
  boolean b = true;
  for (int j = 0; j < (AL.size() - 1); j++) {
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
  Sequence S = new Sequence(); 
  boolean ans = false;
  while (S.again()) {
    S.input();
    S.toArray();
    ans = S.again();
  }
  S.check();
  }
}
