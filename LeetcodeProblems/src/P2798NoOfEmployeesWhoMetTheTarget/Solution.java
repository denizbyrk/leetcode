package P2798NoOfEmployeesWhoMetTheTarget;

public class Solution {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
    	int reached = 0;
    	
    	for (int i = 0; i < hours.length; i++) {
    		
    		if (hours[i] >= target) {
    			
    			reached++;
    		}
    	}
    	
    	return reached;
    }
    
    public static void main(String[] args) {
    	
    	int[] hours = {0,1,2,3,4};
    	int target = 2;
    	
    	int output = Solution.numberOfEmployeesWhoMetTarget(hours, target);
    	
    	System.out.println(output);
    }
}