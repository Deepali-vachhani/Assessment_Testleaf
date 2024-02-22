package Week_1_Day_2;

public class Mobile {

		public void makeCall() {
			 String MobileModel = "Samsung" ;
			 float mobileWeight = 110.5f;
			// System.out.println(MobileModel+"\n" +mobileWeight);
			 System.out.println(MobileModel);
			 System.out.println(mobileWeight);
			 }
		public void sendMsg() {
			boolean isFullCharged = true;
			int mobileCost = 50000;
			System.out.println(isFullCharged );
			System.out.println(mobileCost);
			}
		public static void main(String[] args) {			
			Mobile M = new Mobile();
			M.makeCall();
		    M.sendMsg();			
			System.out.println("This is my mobile");
		}
	}