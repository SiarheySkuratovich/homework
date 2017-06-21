public class OutputOfNumbers {
  public static void main (String[] args) {  
    for (int k = 0; k <= 100; k++) { 
      if (k % 3 == 0 || k % 5 == 0) { 
        if (k % 3 == 0 && k % 5 != 0) {
          System.out.println("Tutti"); 
      } if (k % 5 == 0 && k % 3 != 0) {
          System.out.println("Frutti"); 
      } if (k % 3 == 0 && k % 5 == 0) {
          System.out.println("Tutti-Frutti"); 
      } else {
          System.out.println(k); 
      }
    }
  }
}
