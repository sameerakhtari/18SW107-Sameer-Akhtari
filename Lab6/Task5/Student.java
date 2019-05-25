class Student
{
		String name;
		int age;
		String address;

		public Student()
		{
		name="null";
		age=0;
		address="not available";
		}
		public void setInfo(String name,int age)
		{
				this.name=name;
				this.age=age;
		}
		public void setInfo(String name, int age, String address)
		{
				this.name=name;
				this.age=age;
				this.address=address;
		}
		public void display()
		{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
		System.out.println();
	
		}
}
