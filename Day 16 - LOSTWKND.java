/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int[] arr=new int[5];
	        for(int i=0;i<5;i++){
	            arr[i]=sc.nextInt();
	        }
	        int x=sc.nextInt();
	        int count=0;
	        for(int i=0;i<5;i++){
	            count=count+(arr[i]*x);
	        }
	        if(count<=(24*5)){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	    }
	}
}
