package superclass;

public class ChildClassConstructor extends ParentClassConstructor 
{
	
	public ChildClassConstructor(int a,int b)
	{
		super();
		int res;
		res=a+b;
		System.out.println("Sum = "+res);
	}
	public static void main(String[] args)
	{
		ChildClassConstructor obj=new ChildClassConstructor(5,6);

	}

}
