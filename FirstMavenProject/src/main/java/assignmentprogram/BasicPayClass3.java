package assignmentprogram;

public class BasicPayClass3 extends BasicPayClass2
{
	public void display()
	{
		double grosssal=0;
		double deduct;
		double netpay;
		grosssal=super.basicpay+super.hra+super.bonus;
		deduct=super.pf+super.deduction;
		netpay=grosssal-deduct;
		System.out.println("Basic Pay : "+super.basicpay);
		System.out.println("Hra : "+super.hra);
		System.out.println("Bonus : "+super.bonus);
		System.out.println("Deduction : "+super.deduction);
		System.out.println("Total Pay : "+grosssal);
		System.out.println("Net Salary : "+netpay);
		
	}

	public static void main(String[] args)
	{
		BasicPayClass3 obj=new BasicPayClass3();
		obj.calcualate();
		obj.display();
	}

}
