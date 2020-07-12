package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			StackQueue g=new StackQueue();
			int q=sc.nextInt();
			while(q>0){
				int QueryType=sc.nextInt();
				if(QueryType==1){
					int a =sc.nextInt();
					g.Push(a);
				}
				else if(QueryType==2)
					System.out.print(g.Pop()+" ");
					
				q--;
			}
				System.out.println();
				t--;
			}
		}
}




class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   // Your code here
    	s1.push(x);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {
    	if(s2.empty())
    		while(!s1.empty())
    			s2.push(s1.pop());
    	if(s2.empty() && s1.empty())
    		return -1;
		return s2.pop();
	   // Your code here
    }
}
