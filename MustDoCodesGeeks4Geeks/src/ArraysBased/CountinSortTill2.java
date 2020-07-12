package ArraysBased;

import java.util.Scanner;

public class CountinSortTill2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int noOftestCases;
		long startTime = 0;
				noOftestCases = scanner.nextInt();
				for (int i = 0; i < noOftestCases; i++) {
					int size=scanner.nextInt();
					int result[]={0,0,0};
					for (int X = 0; X < size; X++) {
						int item=scanner.nextInt();
						result[item]++;
					}
					
					for (int j = 0; j < result.length; j++) {
						for (int j2 = 0; j2 < result[j]; j2++) {
							System.out.print(j+" ");
						}
					}
					System.out.println();
				}
		
		
	}

}
