package com.samee.logical;

/*
    WAP to replace a character in given String....
*/

public class StringTest 
{
    public void replaceString(String str,char ch,char temp)
    {
    	String res=null;
	String txt=str;
	String old=str;
	for(int i=0;i<str.length();i++)
	{
            if(str.charAt(i)==ch)
            {
                //System.out.println("Text : "+str);
		txt=str.substring(0,i).concat(temp+"");
		
                //System.out.println("Text : "+txt);
		//System.out.println("Text : "+str.substring(i+1,str.length()));
		res=txt.concat(str.substring(i+1,str.length()));
		str=res;
            }
	}
	
        System.out.println("Given String is	   : "+old);
	System.out.println("Replaced String is : "+res);
    }
    //Start of main method..
    public static void main(String[] args) 
    {
	StringTest ref=new StringTest();
	String str="I Love You, How are you bro";
	//System.out.println("output : "+str[0]);
	ref.replaceString(str,'o','#');
    }
}
