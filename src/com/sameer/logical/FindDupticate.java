package com.sameer.logical;
/*
 * This program is to find duplicate data in a array;
 */

import java.util.HashSet;

public class FindDupticate 
{
    public static void main(String[] args)
    {
	System.out.println(2^0);
	int[] a={2,3,5,2,5,4};
	HashSet<Integer> hs1=new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) 
	{
            if(hs1.add(a[i])==false)
            {
                System.out.println("Duplicate Record");
            }
	}
		
    }

}
