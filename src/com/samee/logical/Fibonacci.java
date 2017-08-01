package com.samee.logical;

/*
    WAP to display fibonacci series upto 100: 
    Fibonacci :  1 1 2 3 5 8 13 21 34....
*/
public class  Fibonacci
{
    public static void main(String[] args) 
    {
	int a,b,c;
	a=b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=1;i<=100;i++)
	{
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
	}
    }
}
