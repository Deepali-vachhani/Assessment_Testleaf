package Week2_day2_Assignment;

public class duplication_2arrays_intersection {

	public static void main(String[] args) {
		// creating two different integer for two arrays
	 int array1[] = {3, 2, 11, 4, 6, 7};
     int array2[] = {1, 2, 8, 4, 9, 7};
        //iterating for loop
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
            	//comparing both the arrays
                if (array1[i] == array2[j]) {
                    System.out.println(array2[j]);
                }
            }
        }
	}
}