/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int x=s.nextInt();
		     int y=s.nextInt();
		      int z=s.nextInt();
		      System.out.println((y<=x)?"PIZZA":(z<=x)?"BURGER":"NOTHING");
		}
	}
}
