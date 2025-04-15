package P2469ConvertTheTemperature;

import java.util.Arrays;

public class Solution {

    public static double[] convertTemperature(double celsius) {
        
    	double fahrenheit = celsius * 1.80 + 32;
    	double kelvin = celsius + 273.15;
    	
    	return new double[] {kelvin, fahrenheit};
    }
	
	public static void main(String[] args) {
		
		double c = 36.50;
		
		double[] output = Solution.convertTemperature(c);
		
		System.out.println(Arrays.toString(output));
	}
}