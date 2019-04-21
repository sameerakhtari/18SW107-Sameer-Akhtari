import java.util.*;
class Task1
{
	public static void main(String abcd[])
	{	int sum,total=300;
		double per;
		char grade;
		Scanner in=new Scanner(System.in);
		System.out.println("Marksheet\n");

		System.out.println("Enter Marks of C++");
		int c=in.nextInt();

		System.out.println("Enter Data Structure marks");
		int data=in.nextInt();

		System.out.println("Enter operating system marks");
		int op=in.nextInt();
		
		sum=(c+data+op);
		per=(100*sum/total);
		if(per>=90)
			grade='A';
		else if(per>=80 && per<90)
			grade='B';
		else if(per>=70 && per<80)
			grade='C';
		else if(per>=60 && per<70)
			grade='D';
		else
			grade='F';
		
		System.out.println("Obtain marks= "+sum+"\nOutof ="+total);
		System.out.println("\nPercentage = "+per+"%"+"\nGrade = "+grade);
	}
}
