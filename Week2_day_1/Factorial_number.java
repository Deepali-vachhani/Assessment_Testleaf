package Week2_day_1;

public class Factorial_number {

	public static void main(String[] args) {
		int number=5;
		int i=1;
		int factorial=i;
		while(i<=number) {
			factorial = factorial*i;
			i++;
		}
		System.out.println(factorial);
	}
}
