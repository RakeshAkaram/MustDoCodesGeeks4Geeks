package StringsBased;

import java.util.Scanner;

public class ReverseWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int noOfTestCases=scanner.nextInt();
		
		String [] inputStrings=new String[noOfTestCases];

			for (int i = 0; i < inputStrings.length; i++) 
				inputStrings[i]=scanner.next();
			
for (int i = 0; i < inputStrings.length; i++) {
	
	String [] splitedString = inputStrings[i].split("\\.");
	
	String output=splitedString[splitedString.length-1];
	
	for (int p = splitedString.length-2; p >=0; p--) 
		 output+= "."+splitedString[p];
	
	System.out.println(output);
}
}
}
