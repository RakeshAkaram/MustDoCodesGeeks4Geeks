package ArraysBased;

import java.util.Scanner;

public class CountTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
		int noOfTestCases=scanner.nextInt();
		int sizeOfArray[]=new int[noOfTestCases];
		int elementsInArray[][]=new int[noOfTestCases][9];
		
		
		for (int i = 0; i < noOfTestCases; i++) {
			System.out.println("Enter size of array: ");
			sizeOfArray[i]=scanner.nextInt();
			System.out.println("Enter elements in the array: "+sizeOfArray[i]);
			for (int j = 0; j < sizeOfArray[i]; j++) 
				elementsInArray[i][j]=scanner.nextInt();
		}
		
		
		for (int i = 0; i < noOfTestCases; i++) {	
			System.out.println("in");
			countTriplets(elementsInArray[i],sizeOfArray[i]);
		}
		
	}

	private static void countTriplets(int[] is, int size) {
		// TODO Auto-generated method stub
		
		
		int count=0;
		for(int k=size-1;k>1;k--){
			int i=0,j=k-1;
			while(i<j){
				if((is[i]+is[j])==is[k]){
					System.out.println(is[i]+":"+is[j]+":"+is[k]);
					count++;
					i++;
					j--;
				}
				else if((is[i]+is[j])>is[k])
					j--;
				
				else
					i++;
				
		}
	}
		System.out.println("Count: "+count);

}
}
