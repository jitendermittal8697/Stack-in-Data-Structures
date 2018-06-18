class stack
{
	static final int max = 100;  
	int top;
	int arr[] = new int[max];
	void push(int x)
	{
		if(!OverFlow())
		{
			top+=1;
			arr[top]=x;
		}
	}
	int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			return -1;
		}
	}
	int pop()
	{
		if(!isEmpty())
		{
			top-=1;
			return arr[top+1];
		}
		else
		{
			return -1;
		}
	}
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean OverFlow()
	{
		if(top==max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	stack()
	{
		top=-1;
	}		
}
class main
{
	public static void main(String args[])
	{
		stack obj = new stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.isEmpty());
	}
}