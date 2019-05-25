class Print
{
	public int n;
	public char c;
	Print(int n, char c)
	{
		this.n=n;
		this.c=c;
	}
	public void method(int i , char c)
	{
        	System.out.println("Integer: "+i);
        	System.out.println("character: "+c);
	}
	public void method(char c , int i )
	{
		System.out.println("character: "+c);
		System.out.println("Integer: "+i);
	}
}