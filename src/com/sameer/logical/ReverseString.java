package com.sameer.logical;

//WAP to reverse a string without using built-in function...
//WAP to reverse a string using recursion..

import java.util.Scanner;
class  ReverseString
{
	//Recursive Method to reverse string....
	public String reverseString(String str)
	{
		if(str.length()<2)
			return str;
		
		return reverseString(str.substring(1))+str.charAt(0);
	}
	//Using charArray() function....
	public void reverseString(String str,int a)
	{
		String res="";
		char strArray[]=str.toCharArray();
		
		for(int i=strArray.length-1;i>=0;i--)
		{
			res=res+strArray[i];
		}
		System.out.println("#Given String   : "+str);
		System.out.println("#Result String  : "+res);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ReverseString ref=new ReverseString();
		System.out.print("Enter the String : ");
		String str=sc.next();
		System.out.println("Given String  : "+str);
		String res=ref.reverseString(str);
		System.out.println("Result String : "+res);
		ref.reverseString(str,4);

	}
}
