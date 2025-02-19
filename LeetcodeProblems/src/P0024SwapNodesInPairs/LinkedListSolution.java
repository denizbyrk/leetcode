package P0024SwapNodesInPairs;

import java.util.LinkedList;

public class LinkedListSolution {
	
    public static LinkedList<Integer> swapPairs(LinkedList<Integer> head) {
        
    	LinkedList<Integer> output = head;
    	
    	for (int i = 0; i < output.size(); i++) {
    		
    		if (i % 2 == 0 && output.size() > 1 && i != output.size() - 1) {
    			
    			int temp = output.get(i);
    			output.set(i, output.get(i + 1));
    			output.set(i + 1, temp);
    		}
    	}
    	
    	return output;
    }
    
    public static void main(String[] args) {
    	
    	LinkedList<Integer> input = new LinkedList<Integer>();
    	
    	input.add(1);
    	input.add(2);
    	input.add(3);
    	input.add(4);
    	input.add(5);
    	input.add(6);
    	
    	LinkedList<Integer> output = LinkedListSolution.swapPairs(input);
    	
    	System.out.println(output);
    }
}