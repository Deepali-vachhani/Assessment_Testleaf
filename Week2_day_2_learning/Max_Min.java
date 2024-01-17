package Week2_day_2_learning;

public class Max_Min {

	public static void main(String[] args) {
		int score[]= {89,78,59,90,100};
	
		int max = score[0]; // Assume the first element is the maximum initially
	    int min = score[0]; // Assume the first element is the minimum initially
	    for (int i = 1; i < score.length; i++) {
	        if (score[i] > max) {
	            max = score[i]; // Update maximum value
	        }
	        if (score[i] < min) {
	            min = score[i]; // Update minimum value
	        }
	    }
	    System.out.println("Maximum value: " + max);
	    System.out.println("Minimum value: " + min);
	}
}

