class MarkSheet{
	int oop,laag,dcld,result,per;
	char grade;
	MarkSheet(int oop,int dcld,int laag){
	this.oop=oop;
	this.dcld=dcld;
	this.laag=laag;
	}
	public int Marks(){
		result=oop+dcld+laag;
		return result;
		}
	public int Per(){
	per=(100*result/300);
	return per;
	}
	public char grade(){
	if(per>=70)
		grade='A';
	else if(per>=60)
		grade='B';
	else if(per>=50)
		grade='C';
	else
		grade='F';
	return grade;
	}
	public void show(){
	System.out.println("Total Marks: 300");
	System.out.println("Obtain Marks:"+Marks());
	System.out.println("Percentage:"+Per());
	System.out.println("Grade:"+grade());
	}
	
}