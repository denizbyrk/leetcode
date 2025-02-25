package P0387FirstUniqueCharacterInAString;

public class Solution {

    public static int firstUniqChar(String s) {
    	
    	char[] chars = s.toCharArray();
    	boolean isUnique = true;
    	
        for (int i = 0; i < chars.length; i++) {
        	
            isUnique = true;
            
            for (int j = 0; j < chars.length; j++) {
            	
                if (i != j && chars[i] == chars[j]) {
                	
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
    	
    	String input = "loveleetcode";
    	
    	int output = Solution.firstUniqChar(input);
    	
    	System.out.println(output);
    }
}