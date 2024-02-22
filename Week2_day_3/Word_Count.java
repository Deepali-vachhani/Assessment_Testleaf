package Week2_day_3;

public class Word_Count {

	public static void main(String[] args) {
	 String input = "TestLeaf";
        char targetChar = 'e'; 
        int count = 0; 
        char[] ch = input.toCharArray();
        for (int i =0;i<ch.length;i++) {
            if (ch[i] == targetChar) {
                count++;
            }
        }
        System.out.println("Count of " + targetChar + " in the string " + count);
	 }
}
