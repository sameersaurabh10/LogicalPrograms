package com.sameer.logical;
/*
    WAP to print sum of a integer digit...
*/
public class SumOfDigit 
{
    public static int sumDigit(int num)
    {
        int sum=0;
	if(num>0)
	{
            sum=sum+num%10+sumDigit(num/10);
	}
	return sum;
    }
    //start of main method...
    
    public static void main(String[] args) 
    {
        System.out.println("sum of digit : "+sumDigit(1234567));
    }

}
