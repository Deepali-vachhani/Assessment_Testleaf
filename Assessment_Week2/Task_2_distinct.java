/* Java program to Check if a given array contains duplicate elements within k distance from each other */
package Assessment_Week2;

public class Task_2_distinct {

public static boolean checkDuplicatesWithinK(int[] nums, int n, int k) {
	for (int i = 0; i < nums.length; i++) {
	      int j = i + 1;
	      int k1 = k;
	      // searching in next k1-1 elements if its
	      // duplicate is present or not
	      while (k1 > 0 && j < nums.length) {
	        if (nums[i] == nums[j]) {
	          return true;
	        }
	        j++;
	        k1--;
	      }
	    }
	    return false;
	}
	public static void main(String[] args)
	  {
		int nums[] = {1,0,1,1};
	    int n = nums.length;
	    if (checkDuplicatesWithinK(nums, n, 1)) {
	      System.out.print("true");
	    }
	    else {
	      System.out.print("false");
	    }
	  }
}
