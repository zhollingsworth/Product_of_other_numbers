/********************************************************************************************************************************
Zac Hollingsworth
4/2/2016

Interview Cake
https://www.interviewcake.com/question/java/product-of-other-numbers

Problem:
You have an array of integers, 
and for each index you want to find the product of every integer except the integer at that index.
Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.
********************************************************************************************************************************/

public class Product_of_Array_Numbers 
{
	public static int[] getProductOfAllIntsExceptAtIndex(int[] take)
	{
		int[] giveBack = new int[take.length];
		int mult = 1;
		
		for(int i = 0; i < take.length; i++)
		{
			for(int j = 0; j < take.length; j++)
			{
				mult = (j != i) ? (mult*take[j]):mult;
						
			}
			giveBack[i] = mult;
			mult = 1;
		}
		return giveBack;
	}
	
	public static void main(String[] args)
	{
		int[] give = new int[]{1, 7, 3, 7};
		
		int[] receive = getProductOfAllIntsExceptAtIndex(give);
		for(int k = 0; k < receive.length; k++)
		{
			System.out.println(receive[k]);
		}
	}
}
