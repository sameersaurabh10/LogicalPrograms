package com.sameer.logical;
/*
    WAP to check that given string is palindriome or not...
*/
public class DemoPalindrome 
{

    public static void main(String[] args) 
    {
        String str="12345678987654321";
	int i,j;
	i=0;
	j=str.length()-1;
	//int k=0;//this variable is used to check that given string is palindrome or not
	while(i<=j)
	{
            if(str.charAt(i)!=str.charAt(j))
            {
                break;
            }
            i++;
            j--;
	}
		

	if(i>j)
            System.out.println("palindrome");
	else
            System.out.println("not a palindrome");
		
	/*if(k!=0)
            System.out.println("not a palindrome");
	else
            System.out.println("palindrome");
	*/
    }

}
