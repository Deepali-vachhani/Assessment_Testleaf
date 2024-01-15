/* Java program to Check if a given array contains duplicate elements within k distance from each other */
package Assessment_Week2;

public class Task_3_distinct {

	public static boolean checkDuplicatesWithinK(int[] nums, int n, int k) {
		for (int i = 0; i < nums.length; i++) {
		      int j = i + 1;//2
		      int k1 = k;  //2
		      // searching in next k1-1 elements if its duplicate is present or not
		      while (k1 > 0 && j < nums.length) { //2>0 && 2<5
		        if (nums[i] == nums[j]) {  //1==2
		          return true;
		        }
		        j++; //3
		        k1--; //2
		      }
		    }
		    return false;
	}
	public static void main(String[] args)
	  {
		int nums[] = {1,2,3,1,2,3};
	    int n = nums.length;
	    if (checkDuplicatesWithinK(nums, n, 2)) {
	      System.out.print("true");
	    }
	    else {
	      System.out.print("false");
	    }
	  }
}
