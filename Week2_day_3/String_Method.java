package Week2_day_3;

public class String_Method {

	public static void main(String[] args) {
		String price="Rs.5000";
		System.out.println(price+10);
		//convert the Rs.5000
		
		String replace = price.replace("RS.", " ");
		System.out.println(replace);
		
		String pr=price.replaceAll("[^0-9]","");
		System.out.println(pr);
		System.out.println(pr+10);
		
		//parse the string into Integer
		int parseInt = Integer.parseInt(pr);
		System.out.println(parseInt+10);
		
	}
}
