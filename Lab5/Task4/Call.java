import java.util.*;
class Call{
	public static void main(String []abcd){
	Scanner S=new Scanner(System.in);
	System.out.println("Enter name ,gender, age respectivily");
	String name=S.nextLine();
	String gender=S.nextLine();
	int age=S.nextInt();

	Student o1=new Student(name, gender, age);
	o1.Show();
	}
}