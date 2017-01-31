package dynamicProgramming;

import java.util.*;

public class FrogJump {
	
	public static boolean canCross(int[] stones) {
		HashMap<Integer, HashSet<Integer>> possibilityMap = new HashMap<Integer, HashSet<Integer>>();
		for(int i = stones.length-1; i >= 0;i--) {
			
		}
		
		return true;
    }
	
	public static void main(String args[]) {
		int stones[] = {0, 1, 3, 5, 6, 8, 12, 17};
		System.out.println(canCross(stones));
		
	}
}