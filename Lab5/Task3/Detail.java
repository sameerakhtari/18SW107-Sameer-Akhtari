import java.util.*;
class Detail{
	public static void main(String []abcd)
	{
		Scanner s=new Scanner(System.in);
		String name,breed,age;
		System.out.print("Enter Dog Name: ");
		name=s.nextLine();
		System.out.print("Enter Dog Breed: ");
		breed=s.nextLine();
		System.out.print("Enter Dog Age: ");
		age=s.nextLine();
		Dog o=new Dog();
		o.setDetails(name,breed,age);
		o.showDetails();
	}
}