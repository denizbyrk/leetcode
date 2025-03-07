package P1678GoalParserInterpretation;

public class Solution {

    public static String interpret(String command) {
        
    	String output = "";
    	
    	char[] characters = command.toCharArray();
    	
    	for (int i = 0; i < characters.length; i++) {
    		
    		if (characters[i] == 'G') {
    			
    			output += "G";
    			
    		} else if (characters[i] == '(') {
    			
    			if (i + 1 < characters.length && characters[i + 1] == ')') {
    				
    				output += "o";
    				i++;
    			} else if (i + 3 < characters.length &&
    					(characters[i + 1] == 'a' &&
    					characters[i + 2] == 'l' &&
    					characters[i + 3] == ')')) {
    				
    				output += "al";
    				i += 3;
    			}
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String[] args) {
    	
    	String command = "(al)()(al)()(al)(al)()()(al)(al)G()(al)()()()()(al)()(al)(al)G()GG(al)(al)G(al)()()G(al)G(al)()G()";
    	
    	String output = Solution.interpret(command);
    	
    	System.out.println(output);
    }
}