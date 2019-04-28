import java.util.*;
class Task3
{
	public static void main(String []abcd)
	{
		Scanner in=new Scanner(System.in);
		int x;
		System.out.print("Enter the ending no: ");
		x=in.nextInt();
		if(x==0)
		{
			System.out.print("0");
		}
		else
		{
			int a=(x+1)*x/2;
			System.out.print(a);
		}
	}
}