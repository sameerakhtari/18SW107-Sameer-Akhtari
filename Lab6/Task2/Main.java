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

		System.out.println("Enter Book Name: ");
		String bookName=s.nextLine();
		System.out.print("Enter Book Price: ");
		double price=s.nextDouble();
		System.out.print("Enter Book Quantity: ");
		int qty= s.nextInt();

		Author a=new Author(name,email,gender);
		Author[] as={a};
		Book b=new Book(bookName,as,price,qty);

		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		System.out.println(b.getQty());
		System.out.println(b.toString());
	}
}