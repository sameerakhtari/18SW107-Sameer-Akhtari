public class Task1_class
{
	private String name;
	private int age;
	private float marks;
	Task1_class(String name, int age, float marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void print(){
		
		System.out.println();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Marks:"+marks);	
		}
}