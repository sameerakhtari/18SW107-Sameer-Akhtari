class Main{
	public static void main(String []abcd){
		Student s=new Student("Sameer","Male",19);
		MarkSheet m=new MarkSheet(80,70,50);
		CreateStudentDetail c=new CreateStudentDetail(s,m);
		c.showDetail();
		}
}
			