package P1528ShuffleString;

public class Solution {

    public static String restoreString(String s, int[] indices) {
        
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
        	
            result[indices[i]] = s.charAt(i);
        }
        
        String output = "";
        
        for (int i = 0; i < result.length; i++) {
        	
        	output += result[i];
        }

        return output;
    }
    
    public static void main(String[] args) {
    	
    	String s = "codeleet";
    	int[] indices = {4,5,6,7,0,2,1,3};
    
    	String output = Solution.restoreString(s, indices);
    	
    	System.out.println(output);
    }
}