import java.util.*;
class Task5
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
			Student s[]=new Student[10];
		
			for(int x=0; x<=9; x++)
		{
			s[x] = new Student();
			System.out.print("Name of student"+(x+1)+": ");
			String name=ss.nextLine();
			System.out.print("Age of student"+(x+1)+": ");
			int age=ss.nextInt();
			ss.nextLine();
			System.out.print("Address of student"+(x+1)+": ");
			String address=ss.nextLine();
			s[x].setInfo(name,age,address);
			
		}
		for(int i=0;i<10;i++)
		{
			s[i].display();		
		}
	}
}