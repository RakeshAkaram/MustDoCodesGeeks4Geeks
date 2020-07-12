package ArraysBased;

import java.util.Scanner;

public class LastIndexOfOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		
		for (int p = 0; p < noOftestCases; p++) {
			String input=scanner.next();
			if(input.contains("1"))
				System.out.println(input.lastIndexOf('1'));
			else
				System.out.println(-1);
		}	
	}

}
