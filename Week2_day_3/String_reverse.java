package Week2_day_3;

public class String_reverse {

	public static void main(String[] args) {
		String s="Deepali";
		
		for(int i = s.length()-1;i>=0;i--) 
		{
			System.out.println(s.charAt(i));
		}
	}
}

//char[] charArray = s.toCharArray();
//
//for(int i = charArray.length-1;i>=0;i--) 
//{
//	System.out.println(charArray[i]);
//}