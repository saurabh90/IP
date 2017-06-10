package com.ip.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInString {
	//method1
	public boolean checkUniqueString(String str)
	{
		if(str==null || str.length()<0)
		{
			return false;
		}
		boolean flag=true;
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
					{
						flag=false;
						
					}
		}
		return flag;
	}
	//method2
	public boolean checkUniqueString1(String str)
	{
		if(str==null || str.length()<0)
		{
			return false;
		}
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str.charAt(i)==str.charAt(j))
					flag=false
					;
			}
		}
		
		return flag;
	}
	//method3
	public boolean checkUniqueString3(String str)
	{
		
		if(str==null || str.length()>128)
		{
			return false;
		}
		boolean strArray[]=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(strArray[ch])
			{
				return false;
			}
			strArray[ch]=true;
		}
		
		
		return true;
	}

}
