
public class Box 
{

	int len;
	int wid;
	int hei;
	public Box(int l,int w,int h) 
	{
		System.out.println("inside simple box constructor");
		len=l;
		wid=w;
		hei=h;
		
	}
	
	public Box()
	{
		len=wid=hei=0;
	}
	
	void volume()
	{
		System.out.println("Volume is"+len*wid*hei);
	}
}
