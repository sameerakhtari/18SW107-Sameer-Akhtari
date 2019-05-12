import java.util.*;
class Main
{
	public static void main(String []abcd)
	{
		Scanner s=new Scanner(System.in);	
		System.out.print("Enter Author Name: ");
		String name=s.nextLine();
		System.out.print("Enter Author Email: ");
		String email=s.nextLine();
		System.out.print("Enter Author Gender(M/F): ");
		char gender = s.next().charAt(0);
	
		Author a=new Author(name,email,gender);
		System.out.println(a.getName());
		System.out.println(a.getEmail());
		System.out.println(a.getGender());
		System.out.println(a.toString());
	}
}