import java.util.*;
class Task4
{
	public static void main(String []abcd)
	{
		int x,y;
		double result=0;
		char ch;
		x=Integer.parseInt(abcd[0]);
		ch=abcd[1].charAt(0);
		y=Integer.parseInt(abcd[2]);

		switch(ch)
		{
			case '+':
			result=x+y;
			break;
	
			case '*':
			result=x*y;
			break;
	
			case '-':
			result=x-y;
			break;
	
			case '/':
			result=x/y;
			break;
		}
		System.out.print(result);
	}
}