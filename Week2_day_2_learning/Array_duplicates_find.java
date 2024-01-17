package Week2_day_2_learning;

import java.util.Arrays;

public class Array_duplicates_find {

	public static void main(String[] args) {
		//duplicate value will be listed
		int num[]= {12,14,15,14,12,17,15};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[j]);
				}
			}	
		}	
	}
}
