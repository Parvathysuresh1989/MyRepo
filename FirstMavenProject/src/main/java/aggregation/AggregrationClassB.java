package aggregation;

public class AggregrationClassB 
{
	String bookname;
	int bookid;
	AggregationClassA ref;
	public AggregrationClassB(String bookname, int bookid,AggregationClassA ref)
	{
		this.bookname=bookname;
		this.bookid=bookid;
		this.ref=ref;
	}

	public void display()
	{
		System.out.println(ref.authorname+" "+ref.place);
		System.out.println(bookname+" "+bookid);
	}
	public static void main(String[] args)
	{
		AggregationClassA obj=new AggregationClassA("Enid Blyton","UK");
		AggregrationClassB obj1=new AggregrationClassB("Famous Five",10,obj);
		obj1.display();
		
	}

}
