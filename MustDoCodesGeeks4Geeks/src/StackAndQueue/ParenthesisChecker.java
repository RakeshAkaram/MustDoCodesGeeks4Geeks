package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
		For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”
		
		Input:
		The first line of input contains an integer T denoting the number of test cases.  Each test case consists of a string of expression, in a separate line.
		
		Output:
		Print 'balanced' without quotes if the pair of parenthesis is balanced else print 'not balanced' in a separate line.
		
		Constraints:
		1 ≤ T ≤ 100
		1 ≤ |s| ≤ 105
		
		Example:
		
	Input:
		3
		{([])}
		()
		([]
		
	Output:
		balanced
		balanced
		not balanced */
		Scanner scanner=new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		String output;
		int top=0;
		for (int p = 0; p < noOftestCases; p++) {
			output="not balanced";
			top=0;
			Stack stack=new Stack();
			char[] input=scanner.next().toCharArray();
			for(char c : input){
				if(c=='{' || c=='(' || c=='[') stack.push(c);
				else if(!stack.empty()){
						if((c=='}' && (char) stack.peek()=='{')
					|| (c==']' && (char) stack.peek()=='[')
					||(c==')' && (char) stack.peek()=='('))
					
					stack.pop();
						else
							break;
						}
				else if(stack.empty()){
					top =-1;
					break;
				}
			}
			if(stack.empty() && top==0) output="balanced";
			System.out.println(output);
		}
	}

}


/*
-----------------------------More Test Case---------------------------
{}{(}))}
{([])}
()
([]
]}(}}
{{()}}[] 
*/
