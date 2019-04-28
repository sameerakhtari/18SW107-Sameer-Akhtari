class Task6
{
	public static void main(String []abcd)
	{
		int myArray[]={5,3,6,7,9,1,0,4,5};
		int count=0;
		int find=Integer.parseInt(abcd[0]);
		for(int x=0; x<=myArray.length-1; x++)
		{
			if(myArray[x]==find)
			{
				System.out.println(find+" found at Array["+x+"]");
				count++;
			}
		}
		if(count==0)
		System.out.print(find+" Not found in array");
	}
}
		
		