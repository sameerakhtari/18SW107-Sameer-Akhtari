import java.util.*;
class Task2
{
	public static void main(String []abcd)
	{
    		Scanner in=new Scanner(System.in);
    		System.out.print("Enter your Units= ");
		int unit=in.nextInt();
		int bill=0;
		if(unit>50)
		{
			if(unit>100)
			{
				if(unit>200)
				{
					if(unit>300)
					{
						bill=((unit-300)*30)+(100*25)+(100*20)+(50*15)+(50*10);
					}
					else
					{
						bill=((unit-200)*25)+(100*20)+(50*15)+(50*10);
					}
				}
				else
				{
					bill=((unit-100)*20)+(50*15)+(50*10);
				}
			}
			else
			{
				bill=((unit-50)*15)+(50*10);
			}
		}
		else
		{
			bill=unit*10;
		}
		System.out.print("Bill of "+unit+" units is = "+bill);
	}
}