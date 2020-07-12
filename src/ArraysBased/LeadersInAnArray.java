package ArraysBased;

import java.util.Scanner;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		
		for (int p = 0; p < noOftestCases; p++) {
			int size = scanner.nextInt();
			int x[]=new int[size];
			for (int i = 0; i < size; i++) 
				 x[i]=scanner.nextInt();
			
			String output=x[size-1]+"";
			int large=x[size-1];
			for (int i = size-2; i >=0; i--){
				if(x[i]>=large){
					large=x[i];
					output=large+" "+output;
				}	
			}
			System.out.println(output);
		}
	}

}
