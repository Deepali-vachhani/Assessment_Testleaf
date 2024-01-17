package Week2_day_1;

public class switch_case_break {

	public static void main(String[] args) {

		String browserType="Firefox";
		
		switch(browserType) {
		case "edge":
		{
			System.out.println("Launch the app in Edge browser");
			break;
		}
		case "Firefox":
		{
			System.out.println("Launch the app in Firefox");
			break;
		}
		case "Opera":
		{
			System.out.println("Launch the app in Opera");
			break;
			
		}
		case "Chrome": 
		{
			System.out.println("Launch the app in Chrome");
			break;
		}
		}
	}

}
