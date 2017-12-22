package roman_to_integer;
import java.lang.String;
import java.util.ArrayList;

public class solution {
    public int romanToInt(String s) {
    	
        int[] a=new int[s.length()];
        int sum=0;
        
        for(int i=0;i<s.length();i++)
        {
        	 switch(s.charAt(i))
        	 {
        	 case 'I':a[i]=1;
        	 break;
        	 case 'X':a[i]=10;
        	 break;
        	 case 'C':a[i]=100;
        	 break;
        	 case 'M':a[i]=1000;
        	 break;
        	 case 'V':a[i]=5;
        	 break;
        	 case 'L':a[i]=50;
        	 break;
        	 case 'D':a[i]=500;
        	 break;
        	 default:
        		 return 0;
        	 }
        }
       	
		sum=sum+a[s.length()-1];		
		
		for(int i=s.length()-1; i > 0; i--)
		{
			if (a[i-1]<a[i])
			{
				sum = sum - a[i-1];
			}
			else
			{
				sum = sum + a[i-1];
			}
		}
		System.out.println(sum);
		return sum;

    }
}
