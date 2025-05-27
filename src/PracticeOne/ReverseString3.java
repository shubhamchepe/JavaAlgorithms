package PracticeOne;

public class ReverseString3 {
	public static void main(String[] args) {
		String original = "hello";
		char[] chars = original.toCharArray();
		int left = 0; int right = original.length()-1;
		
		while(left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
        
	}
}
