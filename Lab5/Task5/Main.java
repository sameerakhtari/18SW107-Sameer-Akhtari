import java.util.*;
class Main{
	public static void main(String []abcd)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter oop dcld laag marks respectivily");
	int oop=s.nextInt();
	int dcld=s.nextInt();
	int laag=s.nextInt();

	MarkSheet o=new MarkSheet(oop,dcld,laag);
	int MarkSheet=o.Marks();
	o.Per();
	o.grade();
	o.show();
	
	}
	
}