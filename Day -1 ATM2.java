/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner (System.in);
	  int n = sc.nextInt();
	  int i=1;
	  while(i<=n){
	      int people = sc.nextInt();
	      int money = sc.nextInt();
	      int[] req= new int[people];
	      for(int j=0;j<people;j++){
	          req[j]= sc.nextInt();
	      }
	      int sum=0;
	      for(int j=0;j<people;j++){
	          sum=req[j]+sum;
	          if(sum<=money){
	          System.out.print("1");
	          }
	         else
	         {
	             System.out.print("0");
	             sum-=req[j];
	         }
	      }
	      i++;
	      System.out.print("\n");
	      }
	      
	  }
} 