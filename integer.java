import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		int count=0;
		while(number>0)
		{
		   number=number/10;
		   count++;
		}
		  System.out.println(count);
		
	
		
		
		
	}
}
