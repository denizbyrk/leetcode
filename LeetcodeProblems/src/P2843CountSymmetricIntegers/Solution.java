package P2843CountSymmetricIntegers;

public class Solution {

    public static int countSymmetricIntegers(int low, int high) {
        
        int count = 0;
        
        for (int num = low; num <= high; num++) {
        	
            String s = Integer.toString(num);
            
            if (s.length() % 2 == 0) {
            	
                int half = s.length() / 2;
                int sum1 = 0;
                int sum2 = 0;
                
                for (int i = 0; i < half; i++) {
                	
                    sum1 += s.charAt(i) - '0';
                    sum2 += s.charAt(i + half) - '0';
                }
                
                if (sum1 == sum2) count++;
            }
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		
		int low = 1;
		int high = 100;
		
		int output = Solution.countSymmetricIntegers(low, high);
		
		System.out.println(output);
	}
}