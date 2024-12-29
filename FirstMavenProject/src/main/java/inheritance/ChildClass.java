package inheritance;

public class ChildClass extends ParentClass 
{
	public void sub()
	{
		int c=30;
		int d=10;
		int diff=c-d;
		System.out.println("Difference = "+diff);
	}
	
	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.add();
		obj.sub();
		
	}

}
