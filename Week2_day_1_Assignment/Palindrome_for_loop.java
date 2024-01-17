package Week2_day_1_Assignment;

public class Palindrome_for_loop {

	public static void main(String[] args) {

		int input=12321;
		int temp,rem;
		
		int org=input;
		
		for(temp=0;org>0;org=org/10) {
			rem=org%10;
			temp=(temp*10)+rem;
		}
		if(temp==input) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
	}
}

