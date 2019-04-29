class Task7
{
	public static void main(String []abcd)
	{
		int myArray[]={1,4,3,2,6,5,8,7,9,0,2,4};
		int i=0;
		while(i<myArray.length)
		{
			int j=0;
			while(j<myArray.length-1)
			{
				if(myArray[j]>myArray[j+1])
				{
					myArray[j]=myArray[j]+myArray[j+1];
					myArray[j+1]=myArray[j]-myArray[j+1];
					myArray[j]=myArray[j]-myArray[j+1];
				}
				j++;
			}
			 i++;
		}
		for(int k=0; k<myArray.length; k++)
		System.out.print(myArray[k]+" ");
	}
}