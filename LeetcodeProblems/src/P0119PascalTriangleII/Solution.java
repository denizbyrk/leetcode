package P0119PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> getRow(int rowIndex) {
    	
        List<Integer> row = new ArrayList<Integer>();
        
        for (int i = 0; i <= rowIndex; i++) {
        	
            row.add(1);
            
            for (int j = i - 1; j > 0; j--) {
            	
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
    
    public static void main(String[] args) {
    	
    	int input = 6;
    	
    	List<Integer> output = Solution.getRow(input);
    	
    	System.out.println(output);
    }
}