package ArraysBased;


import java.util.Arrays;
import java.util.Scanner;

public class MergeWithNoSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int noOfTestCases=scanner.nextInt();
		
		int[][] sizeOfArray1=new int[noOfTestCases][2];;
	
		int elementsInArray[][] = null;
		int elementsInArray1[][] = null;
		
		for (int i = 0; i < noOfTestCases; i++) {
			for(int p=0;p<2;p++){
			sizeOfArray1[i][p]=scanner.nextInt();
			if(p==0)
				elementsInArray=new int[noOfTestCases][sizeOfArray1[i][p]];
			else if(p==1)
				elementsInArray1=new int[noOfTestCases][sizeOfArray1[i][p]];
			}	
			for (int j = 0; j < sizeOfArray1[i][0]; j++) {
				//System.out.println("j: "+j);
				elementsInArray[i][j]=scanner.nextInt();
			}
			for (int j = 0; j < sizeOfArray1[i][1]; j++) {
				elementsInArray1[i][j]=scanner.nextInt();
			}
		}

		
		for (int test = 0; test < noOfTestCases; test++) {	
			System.out.println("size: "+sizeOfArray1[test][0]);
			for (int j = 0; j < sizeOfArray1[test][0]; j++) {
				System.out.println("jp: "+elementsInArray[test][j]);
			}

			for (int j = 0; j < sizeOfArray1[test][1]; j++) 
				System.out.println(elementsInArray1[test][j]);
		}
		
	/*	for (int test = 0; test < noOfTestCases; test++) {		
			//mergeWithoutExtraSpace(elementsInArray[test], elementsInArray1[test],sizeOfArray1[test][0],sizeOfArray1[test][1]);
			int i=0,j=0; 
			System.out.println("size1: "+sizeOfArray1[test][0]+"size2: "+sizeOfArray1[test][1]);
			while((i<sizeOfArray1[test][0]) && (j<sizeOfArray1[test][1])){
				System.out.println("i: "+i+" j: "+j+" test: "+test);
				if(elementsInArray[test][i]>elementsInArray1[test][j]){
					System.out.println("InIF:");
					int temp=elementsInArray[test][i];
					System.out.println("temp: "+temp+" n[]:"+elementsInArray[test][i]);
					elementsInArray[test][i]=elementsInArray1[test][j];
					System.out.println("n[]: "+elementsInArray[test][i]+"m[]: "+elementsInArray1[test][j]);
					elementsInArray1[test][j]=temp;
					System.out.println("temp: "+temp+" n[]: "+elementsInArray[test][i]+" m[]"+elementsInArray1[test][j]);
					Arrays.sort(elementsInArray1[test]);
					System.out.println("temp: "+temp+" n[]: "+elementsInArray[test][i]+" m[]"+elementsInArray1[test][j]);
					System.out.println("l:"+elementsInArray1[test][j]+" L:"+elementsInArray[test][i]);
					j=0;
				}
				else{
					j++;
				}
				i++;
			}
			
			Arrays.sort(elementsInArray1[test]);
			
				for (int g = 0; g < sizeOfArray1[test][0]; g++) {
					System.out.println(elementsInArray[test][g]);
				}
				for (int g = 0; g < sizeOfArray1[test][1]; g++) {
					System.out.println(elementsInArray1[test][g]);
				}
			
		}*/
		
		
	}

}
