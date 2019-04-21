import java.util.*;
class Converter
{
	public static void main(String []abcd)
	{
		Scanner in=new Scanner(System.in);
		
		int choice;
		System.out.println("Converter\n(1) Integer to Binary\n(2) Binary to Integer");
		choice=in.nextInt();
	//decimal to binary
		if(choice==1)
		{
			int result=0,a;
			System.out.println("Enter Integer");
			a=in.nextInt();
			int temp=a; 
			while(temp!=0)
			{
				temp/=2;
				System.out.print("*");
			}
			System.out.print("\b");
			while(a!=0)
			{
				result=a%2;
				a=a/2;
				System.out.print(result);
				System.out.print("\b\b");
			}
		}
	//Binary to decimal
		else if(choice==2)
		{
		
			int result=0,base,a,temp,count=0;
			System.out.print("Enter Binary: ");
			a=in.nextInt();
			temp=a;
			while(temp!=0)
			{
				temp/=10;
				count++;
			}
			for(int x=0; x<=count; x++)
			{
				base=a%10;
				a/=10;
				result+=base*Math.pow(2,(x));	
			}
			System.out.println(result);
		}	
	}
}