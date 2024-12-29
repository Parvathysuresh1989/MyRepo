package accessspecifier;

public class AccessSpecifierEg 
{

	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum = "+sum);
	}
	
	private void sub()
	{
		int c=30;
		int d=10;
		int sub=d-c;
		System.out.println("Difference = "+sub);
	}
	
	protected void multiply()
	{
		int e=5;
		int f=4;
		int prod=e*f;
		System.out.println("Product ="+prod);
	}
	void division()
	{
		int g=10;
		int h=2;
		int div=g/h;
		System.out.println("division = "+div);
	}
	
	
	
	public static void main(String[] args) 
	{
		AccessSpecifierEg obj=new AccessSpecifierEg();
		obj.add();
		obj.sub();
		obj.multiply();
		obj.division();
	}

}
