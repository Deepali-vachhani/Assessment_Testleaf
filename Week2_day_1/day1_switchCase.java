package Week2_day_1;

public class day1_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserType="edge";
		
		switch(browserType) {
		case "edge":
		{
			System.out.println("Launch the app in Edge browser");
		}
		case "Firefox":
		{
			System.out.println("Launch the app in Firefox");
		}
		case "Opera":
		{
			System.out.println("Launch the app in Opera");
		}
		case "Chrome": 
		{
			System.out.println("Launch the app in Chrome");
		}
		}
	}

}
