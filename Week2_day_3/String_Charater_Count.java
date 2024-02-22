package Week2_day_3;

public class String_Charater_Count {

	public static void main(String[] args) {
		String input="TestLeaf";
		int count=0;
		char[] charArray= input.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			if(charArray[i]=='e') {
				count++;
				System.out.println(i);
				System.out.println("Total number of characters in a string: " + count);
			}	
		}
		System.out.println("Total number of characters in a string: " + count);
	}
}
