import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//create a object for this class and execute.
/*
 public class mainclass {
	public static void main(String args[])
	{
		stack_min stk = new stack_min(); 
	}
}
Sample O/P:
Enter Choice: 
1
5
Smallest element in the stack 5
Enter Choice: 
1
3
Smallest element in the stack 3
Enter Choice: 
1
1
Smallest element in the stack 1
Enter Choice: 
1
2
Smallest element in the stack 1
Enter Choice: 
2
Smallest element in the stack3
Enter Choice:  3
 */

public class stack_min {
	Stack s;
	LinkedList l;
	int value;
	int choice=0;
	stack_min()
	{
		s= new Stack();
		l = new LinkedList();
		while(choice!=3)
		{
			System.out.println("Enter Choice: ");
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			switch(choice)
			{
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;			
			}
			
		}
		
	}
	public void insert()
	{
		int element;
		Scanner in = new Scanner(System.in);
		element = in.nextInt();
		s.push(new Integer(element));
		if(l.isEmpty())
		{
				l.add(new Integer(element));
		}
		else
		{
			Integer temp =(Integer) l.getFirst(); 
				if(temp.intValue() > element  )
				{l.addFirst(new Integer(element));}
				else
				l.add(l.getFirst());
		}
		print();
	}
	
	public void delete()
	{
		s.pop();
		l.removeFirst();
		print();
	}
	
	public void print(){
		
		System.out.println("\nSmallest element in the stack : "+l.getFirst());
		/*	System.out.println("\n List");
	
	for(int i=0;i<l.size();i++)
		System.out.print(l.get(i)+" ");
	
	System.out.println("\n Stack");
	
	for(int i=0;i<s.size();i++)
		System.out.print(s.get(i)+" ");*/
	}
}
