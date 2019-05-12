import java.util.Scanner;
class Task7{
	public static void main(String []abcd){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter details in following method \nName , Age , Dept ; Name , Age , Dept ");
		String detail=input.nextLine();
		String split0[]=detail.split(";");
		String split1[]=split0[0].split(",");
		String split2[]=split0[1].split(",");


		System.out.println("Name: "+split1[0]);
		System.out.println("Age: "+split1[1]);
		System.out.println("Program: "+split1[2]);
		System.out.println("\nName: "+split2[0]);
		System.out.println("Age: "+split2[1]);
		System.out.println("Program: "+split2[2]);
	}
}