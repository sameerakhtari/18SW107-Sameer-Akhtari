class Task1_3
{
	public static void main(String []abcd)
	{
		for (int i=1; i<10; i += 2)
		{
    			for (int k=0; k < (4 - i / 2); k++)
    			{
        			System.out.print(" ");
    			}
    		for (int j=0; j<i; j++)
   		{
   		     System.out.print("*");
  		}
 		   System.out.println("");
		}
		
	}
}