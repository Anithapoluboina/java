//finding maximum number of a array
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int []a=new int[4];
		Scanner sc=new Scanner(System.in);
		int m=a[0];
		for(int i=0;i<a.length;i++)
		{ 
		    a[i]=sc.nextInt();
		    
		}
		for(int i=0;i<a.length;i++)
		if(a[i]>m)
		{
		    m=a[i];
		}
		
		{
		    System.out.println(m); 
		}
	}
}