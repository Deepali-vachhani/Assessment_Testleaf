package Week_3_Day_4;

public class Day_4_String_Duplicate {

	public static void main(String[] args) {
		String str = "google";
		//output=gole
		
		String word[] = str.split(",");
		for(int i=0; i<word.length;i++)
		{
			if(word[i]==word[i+1])
			{
				continue;
			}
			for (int j=i+1;j<word.length;j++)
			{
				if(word[j].equalsIgnoreCase(word[i]))
				{
					word[j]="";
				}
			}
		}
		
		
		String text1 = String.join(",",word);
		System.out.println(text1);

	}

}
