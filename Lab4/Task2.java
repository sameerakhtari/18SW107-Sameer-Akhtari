import java.util.*;
class Task2
{
	public static void main(String []abcd)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter which table you want: ");
		int table=in.nextInt();
		System.out.print("Enter starting :");
		int start=in.nextInt();
		System.out.print("Enter Ending :");
		int end=in.nextInt();
		for(int a=start; a<=end; a++)
		{
			System.out.println(table+"x"+a+"="+(table*a));
		}
	}
}	