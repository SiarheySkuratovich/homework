public class OutputOfNumbers {
  public static void main (String[] args) {  
    for (int k = 0; k <= 100; k++) { 
      if (k % 5 == 0 && k % 3 == 0) {
        System.out.println("Tutti-Frutti");
      } else if (k % 5 == 0) {
        System.out.println("Tutti");
      } else if (k % 3 == 0) {
        System.out.println("Frutti");
      } else {
        System.out.println(k);
      }
    }
  }
}
