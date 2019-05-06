class Student{
	String name;
	String gender;
	int age;
	Student(String name, String gender, int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public void show(){
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		}
}