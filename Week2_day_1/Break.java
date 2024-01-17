package Week2_day_1;

public class Break {

	public static void main(String[] args) {
		for (int i=1; i<=20;i++) {
			if(i==7) {
				System.out.println("Execution stopped");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Learning about break");

	}

}
