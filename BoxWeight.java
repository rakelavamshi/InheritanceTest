
public class BoxWeight extends Box 
{
	int weight;
	public BoxWeight(int l,int w,int h,int wgt) 
	{
		super(l,w,h);
		System.out.println("inside box weight constructor");
		
		weight=wgt;
		
	}

}
