package Week2_day2_Assignment;

import java.util.Arrays;

public class Missing_element {

	public static void main(String[] args) {
		
		int arr[]={1, 4,3,2,8, 6, 7};
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		for(int i=1;i<=arr.length;i++) {
			if(i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
		}		
	}

}

