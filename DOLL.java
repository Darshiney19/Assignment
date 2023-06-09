/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Doll
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0)
		{
		    int N=scan.nextInt();
		    int x=scan.nextInt();
		    int arr[]=new int[N];
		    int count=0;
		    for(int i=0;i<N;i++)
		    {
		         arr[i]=scan.nextInt();
		          if(arr[i]>x)
		              count=count+1;   
		    }
		    System.out.println(count);
		}
	}
}
