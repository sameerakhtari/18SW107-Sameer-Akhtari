class Task5
{
	public static void main(String []abcd)
	{	
		int a=7,b=2;
		System.out.println("Bitwise values are "+a+","+b);		
		System.out.println("OR "+(a|b));
		System.out.println("AND "+(a&b));
		System.out.println("NOT "+(~a));
		System.out.println("XOR "+(a^b));
		System.out.println("Left shift "+(a<<b));
		System.out.println("Right shift  "+(a>>b));
		System.out.println("unsigned right shift  "+(a>>>b));
	}
}