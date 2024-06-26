package com.sagility;

public class DemoOnException {

	public static void main(String[] args) {
		
		int a=5,b=0;
		int arr[]= {1,4,3,0,6,6,8};
		try {
			
			for(int i=0;i<=arr.length;i++)
			
			try {
				System.out.println(a/arr[i]);
			}
			catch(ArithmeticException ae)
			{
				ae.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("finally block executed");
			}
		
		}
		catch(ArrayIndexOutOfBoundsException ae ) {
			ae.printStackTrace();
		}
		
		
		
		
		System.out.println("End of the main");

	}

}