package Week2_day_3;

public class String_Basic {
	public static void main(String[] args) {
		String name="TCS" ;		
		String Name="TCS LTD";		
		String name1=new String("TCS PVT LTD");
		if(Name==name1) { 
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
		if(name==Name) { 
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
         if(name.equalsIgnoreCase(name1)) {
			System.out.println("Values are same");
		}else {
			System.out.println("Values are not same");
		}	
	}
}
