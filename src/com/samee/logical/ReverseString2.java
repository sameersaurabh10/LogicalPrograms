package com.samee.logical;

//WAP to reverse a string except first and last character which has length less than 4..

import java.util.Scanner;
public class  ReverseString2
{
    public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String : ");
	String st=sc.next();
	String str="how are your";
	if(str.length()>3)
        {
            char[] strArray=str.toCharArray();
            String res="";
            res=res+strArray[0];
            // For String...(single word)..
            for(int i=strArray.length-2;i>0;i--)
            {
		res=res+strArray[i];
            }
		
            res=res+str.charAt(str.length()-1);
            System.out.println("Given String  : "+str);
            System.out.println("Result String : "+res);
		
        }
	else
	{
            System.out.println("Given String : "+str);
            System.out.println(str.length());
	}
    }
}
