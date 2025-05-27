package PracticeOne;

public class ReverseString1 {
	public static void main(String[] args) {
		String original = "hello";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println("Reversed " + reversed);
	}
}
