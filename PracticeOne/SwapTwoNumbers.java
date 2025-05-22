//Swap values of a & b with using third variable

public class SwapTwoNumbers {
   public static void main(String[] args) {
    int a = 10;
    int b = 5;

    int c = a;
    a = b;
    b = c;

    System.out.println("Swapped Values Of a & b : " + a + " " + b);
   }
}
