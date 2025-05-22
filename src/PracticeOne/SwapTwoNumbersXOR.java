//Swap values of a & b with using third variable Bitwise XOR
package PracticeOne;

public class SwapTwoNumbersXOR {

    public static void main(String[] args) {
        int a = 5;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Swapped Values Of a & b : " + a + " | " + b);
    }

}
