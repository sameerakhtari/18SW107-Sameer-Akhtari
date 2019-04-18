class MyArray
{
	public static void main(String []abcd)
	{
		int []myArray={1,3,5,7,9,11,13,15};
		int x=0;
		System.out.println("Assending array");
		while(x<=(myArray.length-1)){
			System.out.print(myArray[x]+"  ");
			x++;
			}
		System.out.println();
		System.out.println("Descending array");	
		int y=(myArray.length-1);
		while(y>=0){
			System.out.print(myArray[y]+"  ");
			y--;
			}
	}
}