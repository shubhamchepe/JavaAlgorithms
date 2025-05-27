package PracticeOne;

public class ReverseString2 {
	public static void main(String[] args) {
		String original = "hello";
		String reversed = "";
		
		//System.out.println(original.charAt(4));
		for(int i=original.length()-1;i>0;i++) {
			reversed += original.charAt(i);
		}
		System.out.println("Reversed : " + reversed);
	}
}
