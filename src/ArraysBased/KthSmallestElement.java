package ArraysBased;

import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		
		for (int p = 0; p < noOftestCases; p++) {
			int buffer[]=new int[100001];
			int size = scanner.nextInt();
			//int x[]=new int[size];
			for (int i = 0; i < size; i++) {
				int temp=scanner.nextInt();
				buffer[temp%100000]++;
			}
			int kSmallest = scanner.nextInt();
			int i=0;
			while(kSmallest>0){
				i++;
				if(buffer[i]!=0)
					kSmallest-=buffer[i];
			}
			
			System.out.println(i);
			
		}
	}

}
