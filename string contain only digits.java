//  check if string contain only  digits
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a = sc. nextLine();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<a.length();i++)
		{   
		     char ch=a.charAt(i);
		  if(Character.isDigit(ch)==false)
		    {
		        System.out.println("no digits");
		        System.exit(0);
		    }
		}
		
		System.out.println("digits");
	}