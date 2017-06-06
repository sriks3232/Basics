package s1;

public class BOX {
	private double length,breadth,height;
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setBreadth(double breadth)
	{
		this.breadth=breadth;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double volume()
	{
		return length*breadth*height;
	}
	public static void main(String args[])
	{
	   BOX b=new BOX();
		b.setLength(20.0);
		b.setBreadth(20.0);
		b.setHeight(20.0);
		double v=b.volume();
		System.out.println("volume of box:"+b.volume());
	}
}


