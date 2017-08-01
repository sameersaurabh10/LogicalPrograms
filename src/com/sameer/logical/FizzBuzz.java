package com.sameer.logical;

/*
  WAP to print number from 1 to 50,
  And multiple of 3 print Fizz,
  And multiple of 5 print Buzz,
  And Multiple of 3 and 5 print FizzBuzz
*/

public class FizzBuzz 
{
    public static void main(String[] args) 
    {
    	for(int i=1;i<=50;i++)
    	{
            if(i%15==0)
		System.out.println("FizzBuzz");
            else if(i%5==0)
		System.out.println("Buzz");
            else if(i%3==0)
		System.out.println("Fizz");
            else
		System.out.println(i);
	}
        
    }
}
