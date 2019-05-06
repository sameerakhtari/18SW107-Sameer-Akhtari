class CreateStudentDetail
{
	Student s;
	MarkSheet m;
	CreateStudentDetail(Student s,MarkSheet m){
	this.s=s;
	this.m=m;
	}
		
	void showDetail(){
	s.show();
	m.show();
	}
}