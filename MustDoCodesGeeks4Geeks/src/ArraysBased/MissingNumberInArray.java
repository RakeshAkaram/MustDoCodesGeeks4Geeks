package ArraysBased;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);   
		BufferedReader br=new BufferedReader(r);
		  
		    
				int noOftestCases;
				try {
					noOftestCases = Integer.parseInt(br.readLine());
					for (int i = 0; i < noOftestCases; i++) {
						int size = Integer.parseInt(br.readLine());
						int inputArray[]=new int[size-1];
						String elements[]=br.readLine().split(" ");
						for (int j = 0; j <size-1; j++) {
							inputArray[j]=Integer.parseInt(elements[j]);
						}
				//*****LOGIC PART*******//
						for (int j =0 ; j < size-2; j++) { 
							if(inputArray[j]!=inputArray[j+1]-1)
							System.out.println("MissingNo: "+(inputArray[j]+1));
						}	
						
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
