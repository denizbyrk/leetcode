package P0003LongestSubstringWithoutRepeatingChars;

public class Solution {

	public static int lengthOfLongestSubstring(String s) {

		int maxLength = 0;
		String longestSubstr = "";

		for (int i = 0; i < s.length(); i++) {
			
			StringBuilder subStr = new StringBuilder();

			for (int j = i; j < s.length(); j++) {
				
				if (subStr.toString().contains(String.valueOf(s.charAt(j)))) {
					
					break;
				}
				
				subStr.append(s.charAt(j));
			}

			if (subStr.length() > maxLength) {
				
				maxLength = subStr.length();
				longestSubstr = subStr.toString();
			}
		}

		System.out.println(longestSubstr);
		
		return maxLength;
	}

	public static void main(String[] args) {
		
		String input = "pwwkew";
		
		int output = Solution.lengthOfLongestSubstring(input); 
		
		System.out.println(output);
	}
}