package com.sameer.logical;
/*
    WAP to find second max value from  a given array..
*/
public class SecondMax 
{
    public static void main(String[] args) 
    {
        int []a={1,54,2,-1,9,30,0,32,1324,43,90,60054,26,76,100,98,54};
	int max1=a[0];
	int max2=a[1];
	int max3=a[2];
	for(int i=1;i<a.length;i++)
	{
            if(max1<a[i])
            {
            	max3=max2;
		max2=max1;
		max1=a[i];
            }
            else if(max2<a[i])
            {
		max3=max2;
		max2=a[i];
            }
            else if(max3<a[i])
            {
		max3=a[i];
            }
	}

	System.out.println("first  max : "+max1);
	System.out.println("Second max : "+max2);
	System.out.println("Third  max : "+max3);
    }

}
