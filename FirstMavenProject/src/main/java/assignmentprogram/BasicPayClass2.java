package assignmentprogram;

public class BasicPayClass2 extends BasicPayClass1
{
	double hra,pf;
	public void calcualate()
	{
		
		
		hra=0.05*super.basicpay;
		pf=0.2*super.basicpay;
		//System.out.println("Basic Pay = "+super.basicpay);
		System.out.println("HRA = "+hra);
		System.out.println("PF = "+pf);
		
	}
}
