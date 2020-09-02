package DataStructure;



	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class LeftRotation {
		
		void rotationOutput(int[] a,int d){
			int x=a.length;
			int n1=x;
			int b[]=new int[n1];
			int c[]=a;
			while(d>0) {
				
					b[n1-1]=c[0];	
			
					for(int m=0;m<n1-1;m++) {
						b[m]=c[m+1];
					}

			for (int l=0;l<x;l++ )
			{
				c[l]=b[l];
			}
			d--;
			
			}
			
			for (int k=0;k<x;k++ )
			System.out.print(c[k]+" ");
		}

		

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	
	    	LeftRotation lr=new LeftRotation();
	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }
	        
	        lr.rotationOutput(a, d);
	        scanner.close();
	     
	    }

	}
