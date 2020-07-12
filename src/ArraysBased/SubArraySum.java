package ArraysBased;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
	//***INPUT PART***//
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
		
	String geeks4GeeksVersion="Yes";
	
		System.out.println("Enter no of test cases: ");
		int noOfTestCases=scanner.nextInt();
		int sizeOfArray[]=new int[noOfTestCases];
		int[][] sizeOfArray1=new int[noOfTestCases][2];;
		int sum[]=new int[noOfTestCases];
		int elementsInArray[][]=new int[noOfTestCases][99999];
	
	
	if(geeks4GeeksVersion.equals("No")){	
		for (int i = 0; i < noOfTestCases; i++) {
			System.out.println("Enter size of array: ");
			sizeOfArray[i]=scanner.nextInt();
			System.out.println("Enter sum: ");
			sum[i]=scanner.nextInt();
			System.out.println("Enter elements in the array: ");
			for (int j = 0; j < sizeOfArray[i]; j++) {
				elementsInArray[i][j]=scanner.nextInt();
			}
		}
	}	
	
	else{
		for (int i = 0; i < noOfTestCases; i++) {
			for(int p=0;p<2;p++){
			sizeOfArray1[i][p]=scanner.nextInt();
			}	
			for (int j = 0; j < sizeOfArray1[i][0]; j++) {
				elementsInArray[i][j]=scanner.nextInt();
			}
		}
	}
	if(geeks4GeeksVersion.equals("No")){
		for (int i = 0; i < noOfTestCases; i++) {		
			subArraySumEqualK(elementsInArray[i], sum[i],sizeOfArray[i]);
		}
	}
	else{
		for (int i = 0; i < noOfTestCases; i++) {		
			subArraySumEqualK(elementsInArray[i], sizeOfArray1[i][1],sizeOfArray1[i][0]);
		}
	}
			
			
}		
	
	
	private static void subArraySumEqualK(int[] array, int sum, int arraySize) {
		// TODO Auto-generated method stub
		//*****LOGIC PART*****//
				int subArraySum=0;
				int startIndex=0;
				boolean match=false;
				
				for (int endIndex = 0; endIndex < arraySize; endIndex++) {
					if(subArraySum==sum){
						System.out.println("Front: "+(startIndex+1)+"\nEnd : "+endIndex);
						match=true;
					break;
					}
						subArraySum+=array[endIndex];
						
						while(subArraySum>sum){
							subArraySum-=array[startIndex];
							startIndex++;
						}	
				}
				if(match==false)
					System.out.println("-1");
	}
	
	
}
