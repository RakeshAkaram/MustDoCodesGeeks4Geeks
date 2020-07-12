package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingTwoQueues {

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

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
    	if(q2.empty())
    		while(!q1.empty())
    			q2.add(q1.poll());
    	if(q2.empty() && s1.empty())
    		return -1;
		return s2.pop();
		return 0;
	    // Your code here
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here	
    }
}
