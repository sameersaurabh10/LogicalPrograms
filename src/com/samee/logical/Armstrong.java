package com.samee.logical;
/*
    WAP to check the given number is armstrong or not.
*/
import java.util.Scanner;

public class  Armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num=sc.nextInt();
	int temp;
	int x=num;
	int res=0;
	while(num>0)
	{
            temp=num%10;
            res=res+temp*temp*temp;
            num=num/10;
	}
	if(x==res)
            System.out.println("Give number is armstrong....");
	else
            System.out.println("Give number is not armstrong....");
	
        System.out.println("sameer".substring(1));
    }
}
