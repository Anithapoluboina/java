//finding linear search of array
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int []a=new int[n];
		int flag=1;
		for(int i=0;i<a.length;i++)
		{ 
		    a[i]=sc.nextInt();
		    
		}
		int b=sc.nextInt();
		for(int i=0;i<a.length;i++)
		if(a[i]==b)
		{
		   System.out.println("found at index"+i );
		   flag=0;
		   break;
		}
		
	   if(flag==1)
		{
		     System.out.println("not found"); 
		}
		    
		
	}
}