package encapsulation;

public class Bank {

private int pinno;

	
	public void setpin(int pinno)
	{
		this.pinno=pinno;
		
		
	}
	
	public void getpin()
	{
		if(pinno==1001 ||pinno==1234 ||pinno==1212)
		{
			System.out.println("valid pin, withdraw amount");
			
			
		}
		else 
		{
			System.out.println("invalid pin");
		}
	}
}
