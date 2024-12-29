package aggregation;

public class AggregationEgB {
	
	AggregationEgA ag;
	int x,y;
	int diff;
	public AggregationEgB(int x,int y, AggregationEgA ag)
	{
		
		this.x=x;
		this.y=y;
		 diff=x-y;
		this.ag=ag;
		
		
	}

	public void display()
	{
		System.out.println("sum = "+ag.add);
		System.out.println("diff = "+diff);
	}
	public static void main(String[] args) {
		
		AggregationEgA ob=new AggregationEgA();
		AggregationEgA ob1=new AggregationEgA(10,20);
		AggregationEgB obj=new AggregationEgB(20,10,ob1);
		obj.display();

	}

}
