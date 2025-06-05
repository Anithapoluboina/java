//data copy to one array to another array
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{ 
		    a[i]=sc.nextInt();
		    
		}
		for(int i=0;i<a.length;i++)
		{
		   b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
		     System.out.println(b[i]); 
		}    
		
	}
}