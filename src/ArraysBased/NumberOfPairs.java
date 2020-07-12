package ArraysBased;

import java.util.Scanner;

public class NumberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Scanner scanner=new Scanner(System.in);
		
				int noOftestCases;
				long startTime = 0;
						noOftestCases = scanner.nextInt();
					for (int i = 0; i < noOftestCases; i++) {
						int size[] = new int[2];
						for(int j=0;j<2;j++){
							size[j]=scanner.nextInt();
						}
						
						double X[]=new double[size[0]];
						double Y[]=new double[size[1]];
						
						for (int j = 0; j <size[0]; j++) {
							int temp=scanner.nextInt();
							X[j]=Math.log10(temp)/temp;
							
						}
						
						for (int j = 0; j <size[1]; j++) {
							int temp=scanner.nextInt();
							Y[j]=Math.log10(temp)/temp;
						}
						
	/////////////////////LOGIC//////////////////////////////////
						 startTime = System.currentTimeMillis();
						int count=0;
						
						for (int j = 0; j <size[0]; j++) {
							for (int p = 0; p <size[1]; p++) {						
								if(X[j]>Y[p])
									count++;	
							}
						}
						
						System.out.println(count);
							
					}	
					
					long endTime = System.currentTimeMillis();

					long timeElapsed = endTime - startTime;

					System.out.println("Execution time in milliseconds: " + timeElapsed);
	

}
	

	
}
