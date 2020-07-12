package ArraysBased;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RearrangeArrayAlternately {

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
						
						rearrangeArrayAlternate(inputArray,size);
						
					}
					}
					 catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	

	}

	private static void rearrangeArrayAlternate(int[] inputArray, int size) {
		int mid=(int) Math.ceil(size/2);
		int p=1;
		for(int i=0; i<size;i++){
			int temp =inputArray[i];
			inputArray[i]=inputArray[size-p];
			inputArray[size-p]=temp;
			p++;
		}
		
	}
		
		
	}
	
