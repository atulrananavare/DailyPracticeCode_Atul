package dailyPracticeCode.March.day3;

public class ShuffleArray {

	public static void main(String[] args) {
		
		
		int[] nums= {2,5,1,3,4,7};
		
		
		
		int[] output = shuffle(nums,3);

        if(output!=null)
        {
            for(int i : output)
            {
                System.out.println(i);
            }
        }

	}

	public static int[] shuffle(int[] nums, int n) {

		int[] res = new int[nums.length];

		for (int i = 0; i < n; i++) {
			res[i * 2] = nums[i];
			res[2 * i + 1] = nums[n + i];

		}
		return res;
	}

}
