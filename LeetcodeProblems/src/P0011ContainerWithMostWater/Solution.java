package P0011ContainerWithMostWater;

public class Solution {

	public static int maxArea(int[] height) {
		
		if (height.length == 2) {
			
			return Math.min(height[0], height[1]);
		}
		
        int prev = 0;
        int next = height.length - 1;
        int largestArea = 0;

        while (prev < next) {
        	
            int minHeight = Math.min(height[prev], height[next]);
            int area = minHeight * (next - prev);
            largestArea = Math.max(largestArea, area);

            if (height[prev] < height[next]) {
            	
            	prev++;
            } else {
            	
            	next--;
            }
        }
		
		return largestArea;
	}

	public static void main(String[] args) {

		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		
		int maxArea = Solution.maxArea(height);
		
		System.out.println(maxArea);
	}
}