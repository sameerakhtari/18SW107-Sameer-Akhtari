class Task3
{
	public static void main(String abcd[])
	{
		int result=1, x=1;
		int fact = Integer.parseInt(abcd[0]);
		while(x<=fact)
		{
			result=result*x;
			x++;
		}
	System.out.println("Factorial of "+fact+" is = "+result);
	}
}
