import java.util.*;
class Task2_1{
	int []myArray=new int[5];
	Scanner s=new Scanner(System.in);
	public void populateArray(){
			int x=0;
			while(x<=myArray.length-1)
				{
					System.out.print("Enter Value for Array["+x+"]");
					myArray[x]=s.nextInt();
					System.out.println();
					x++;
				}
				}
	public void print(){
			int z=0,y=0;
			System.out.println("Even numbers");
			while(y<=myArray.length-1){
				if(myArray[y]%2==0)
					System.out.println(myArray[y]);
				y++;
				}
			System.out.println("Odd Numbers");
			while(z<=myArray.length-1){
				if(myArray[z]%2!=0)
					System.out.println(myArray[z]);
				z++;
				}
	
			}

}