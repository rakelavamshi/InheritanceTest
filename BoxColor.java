
public class BoxColor extends BoxWeight 
{
	
	String color;
	public BoxColor(int l,int w,int h,int wgt,String c) 
	{
		super(l,w,h,wgt);
		color=c;
	}
	
	public static void main(String[] args)
	{
		BoxColor bc=new BoxColor(1, 3, 5, 4,"black");
		bc.volume();		
	}
}
