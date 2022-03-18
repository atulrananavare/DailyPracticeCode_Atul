package dailyPracticeCode.March.day2;

import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
	
		int[] nums = {0,1,2,2,3,0,4,2};
			
		System.out.println(removeElement(nums,2));

	}
	
public static int removeElement(int[] nums, int val) {
	
	int newIndex=0;
	
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]!=val) {
			nums[newIndex]=nums[i];
			newIndex++;
		}
	}
	
	return newIndex;
        
    }

}
