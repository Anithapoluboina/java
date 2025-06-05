//finding 0dd  of a array
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{ 
		    a[i]=sc.nextInt();
		    
		}
		for(int i=0;i<a.length;i++)
		if(a[i]%2==1)
		{
		    System.out.println(a[i]); 
		}
	}
}