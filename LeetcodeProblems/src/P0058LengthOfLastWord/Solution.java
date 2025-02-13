package P0058LengthOfLastWord;

public class Solution {

	public static int lengthOfLastWord(String s) {
		
		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) == ' ') {
			
			System.out.println(i);
			--i;
		}

		
		final int lastIndex = i;
		
		while (i >= 0 && s.charAt(i) != ' ') {
			
			System.out.println(i);
			--i;
		}


		return lastIndex - i;
	}
	
	public static void main(String[] args) {
		
		String input = "The quick brown fox";
		
		int lengthOfLastWord = lengthOfLastWord(input);
		
		System.out.println(lengthOfLastWord);
	}
}