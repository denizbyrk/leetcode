package P0013RomanToInteger;

public class Solution {
	
    public static int romanToInt(String s) {
        
    	int sum = 0;
    	
    	for(int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			
			case 'M':
				
				if(i > 0 && s.charAt(i - 1) == 'C') {
					sum += 0;
				} else {
					sum += 1000;
				}
				break;
			case 'D':
				
				if(i > 0 && s.charAt(i - 1) == 'C') {
					sum += 0;
				} else {
					sum += 500;
				}
				break;
			case 'C':
				
				if(i > 0 && s.charAt(i - 1) == 'X') {
					sum += 0;
				} else if(i + 1 < s.length() && s.charAt(i + 1) == 'D') {
					sum += 400;
				} else if(i + 1 < s.length() && s.charAt(i + 1) == 'M') {	
					sum += 900;
				} else {
					sum += 100;
				}
				break;
			case 'L':
				
				if(i > 0 && s.charAt(i - 1) == 'X') {
					sum += 0;
				} else {
					sum += 50;
				}
				break;
			case 'X':
				
				if(i > 0 && s.charAt(i - 1) == 'I') {
					sum += 0;
				} else if(i + 1 < s.length() && s.charAt(i + 1) == 'L') {
					sum += 40;
				} else if(i + 1 < s.length() && s.charAt(i + 1) == 'C') {	
					sum += 90;
				} else {
					sum += 10;
				}
				break;
			case 'V':
				
				if(i > 0 && s.charAt(i - 1) == 'I') {
					sum += 0;
				} else {
					sum += 5;
				}
				break;
			case 'I':
				
				if(i + 1 < s.length() && s.charAt(i + 1) == 'V') {
					sum += 4;
				} else if(i + 1 < s.length() && s.charAt(i + 1) == 'X') {	
					sum += 9;
				} else {
					sum += 1;
				}
				break;
    		}
    	}
    	
    	return sum;
    }

	public static void main(String[] args) {
		
		String input = "MCMXCIV";
		
		int output = romanToInt(input);
		
		System.out.println(output);
	}
}