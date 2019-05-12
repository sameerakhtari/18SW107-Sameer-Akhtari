class Task4_class
{
	double x,y,z;
	public void area(double x, double y)
	{
		this.x=x;
		this.y=y;
		z=x*y;
		System.out.println("Recangle Area is: "+z);
	}
	public void area(double x)
	{
		this.x=x;
		z=x*x;
		System.out.print("Square Area is: "+z);			
	}
}