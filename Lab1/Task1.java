class Task1
{
	public static void main(String []abcd)
	{
	String name;
	int totalmarks,marks;
	float per;
	char grade;
	boolean status;
	byte section;

	name="Sameer Akhtari";
	totalmarks=1100;
	marks=855;
	per=(100*marks/totalmarks);
	section='A';	

	if(per>=70)
		grade='A';
	else if(per>=60)
		grade='B';
	else if(per>=50)
		grade='C';
	else
		grade='F';

	if(per>=50)
	status=true;
	else
	status=false;
		
	System.out.println("Name= "+name);
	System.out.println("Total Marks= "+totalmarks);
	System.out.println("Obtain Marks= "+marks);
	System.out.println("Percentage= "+per+"%");	
	System.out.println("Grade= "+grade);
	if(status)
	System.out.println("Status: Pass");
	else
	System.out.println("Status: Fail");


	}
}


