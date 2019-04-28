class Task4
{
	public static void main(String []abcd)
	{
		int [][] array1={{8,4,2},{9,1,4},{7,2,9}};
		int [][] array2={{9,8,7},{6,5,4},{3,2,1}};
		int [][] array3=new int[3][3];                                                                                                                                                                                                                                                                                                                                                                                                                           
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array1.length ; j++)
			{
				array3[i][j]=array1[i][j]+array2[i][j];
				System.out.print(array3[i][j]+"  ");
			}
			System.out.println();
		}
								 	
	}
}	