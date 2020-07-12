package ArraysBased;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		for (int p = 0; p < noOftestCases; p++) {
			
			int size = scanner.nextInt();
			int sum=0,sum1=0;
					boolean result=false;
			int index=size/2;
			int x[]=new int[size];
			for (int i = 0; i < size; i++) {
				x[i]=scanner.nextInt();
				sum+=x[i];
				if(i<index)
					sum1+=x[i];
			}
	System.out.println("sum: "+sum+" sum1: "+sum1);	
			while (sum1!=(sum-sum1-x[index])) {
				System.out.println(" sum: "+(sum-sum1-x[index])+" sum1: "+sum1+" index: "+index);	
				if(sum1>(sum-sum1-x[index])){
					index--;
					if(index==0){
						result=true;
						break;
					}
					sum1-=x[index];
				}
				else if ((sum-sum1-x[index])>sum1) {
					index++;
					if(index==size){
						result=true;
						break;
					}
					sum1+=x[index];
				}
			}

			if(result)
				System.out.println(-1);
			else
				System.out.println(index+1);
			
			
		}
		
		
	}

}
