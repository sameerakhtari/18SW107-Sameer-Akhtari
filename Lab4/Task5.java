class Task5
{
	public static void main(String []abcd)
	{
		int myArray[]={1,4,3,2,6,5,8,7,9,0,2,4};
		for(int i=0; i<myArray.length; i++)
		{
			for(int j=0; j<myArray.length-1; j++)
			{
				if(myArray[j]>myArray[j+1])
				{
					myArray[j]=myArray[j]+myArray[j+1];
					myArray[j+1]=myArray[j]-myArray[j+1];
					myArray[j]=myArray[j]-myArray[j+1];
				}
			}
		}
		System.out.print("Largest value is: "+myArray[myArray.length-1]);
	}
}