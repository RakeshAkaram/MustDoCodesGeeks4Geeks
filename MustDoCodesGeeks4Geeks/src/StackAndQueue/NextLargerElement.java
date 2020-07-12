package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		
		Stack stack=new Stack();
		for (int p = 0; p < noOftestCases; p++) {
			int size=scanner.nextInt();
			int[] input=new int[size];
			int top;
			for(int i=0;i<size;i++){
				input[i]=scanner.nextInt();
				if(stack.empty()){
					stack.push(input[i]);
					input[i]=-1;
					
				}	
				
				else if(Integer.parseInt(stack.peek()+"") < input[i]){
					top=i;
				while(!stack.empty() && (Integer.parseInt(stack.peek()+"") < input[i]) && top!=0 ){
					if(input[top-1]==-1){
						input[--top]=input[i];
						stack.pop();
					}
					else
						--top;
				}
					stack.push(input[i]);
					input[i]=-1;
					
				}
				else{
					stack.push(input[i]);
					input[i]=-1;
					
				}
					
				
			}
			 for(int i=0;i<size;i++){
				 System.out.print(input[i]+" ");
				 if(i==size-1)
					 System.out.println();
			 }
				
		}
		
		
		
	}

}
