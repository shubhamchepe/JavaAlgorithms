//Swap values of a & b without using third variable

package PracticeOne;

public class SwapTwoNumbersWTV {
   public static void main(String[] args) {
    int a = 10;
    int b = 5;

    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println("Swapped Values Of a & b : " + a + " " + b);

   }
}
