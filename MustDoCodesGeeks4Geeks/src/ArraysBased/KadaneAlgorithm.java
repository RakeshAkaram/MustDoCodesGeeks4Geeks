package ArraysBased;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);   
		BufferedReader br=new BufferedReader(r);
		  
		    try {
				int noOftestCases =Integer.parseInt(br.readLine());
				for (int i = 0; i < noOftestCases; i++) {
					int size = Integer.parseInt(br.readLine());
					int inputArray[]=new int[size];
					String elements[]=br.readLine().split(" ");
					for (int j = 0; j <size; j++) {
						inputArray[j]=Integer.parseInt(elements[j]);
					}
			//*****LOGIC PART*******//
					
		
			int sum=inputArray[0];
			int subArraySum[]=new int[size];
			subArraySum[0]=sum;
			for (int j = 1; j < size; j++) { 
				subArraySum[j]=Math.max(inputArray[j], inputArray[j]+sum);
				sum=subArraySum[j];
			}		
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < subArraySum.length; j++) {
				if(max<subArraySum[j]){
					max=subArraySum[j];
				}
			}
			System.out.println("Max: "+max);
					
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		    
		    
	}

}
