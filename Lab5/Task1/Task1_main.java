import java.util.Scanner;
class Task1_main{
	public static void main(String []abcd)
	{
		Scanner x=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=x.nextLine();
		System.out.print("Enter Age:");
		int age=x.nextInt();
		System.out.print("Enter Marks:");
		float marks=x.nextFloat();

		Task1_class o1=new Task1_class(name,age,marks);
		o1.print();
	}
}