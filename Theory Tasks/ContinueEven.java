class ContinueEven
{
	public static void main(String []abcd)
	{
		System.out.println("Even series using \"Continue\" Jump statement");
		for(int i=0; i<=10; i++)
		{
			if(i%2!=0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}