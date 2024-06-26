package com.sagility;

public interface Interface1 {
	
	public void sayHello();
	
	String name="Swapna";
	public void printName();
	
	public default void printNums(int num) {
		for(int i=1;i<=num;i++)
			System.out.println(i);
		
		fact(7);
	}
	
	
	public static void sumOnN(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
	}
	
	private int fact(int a) {
		if(a==1)
			return 1;
		else
			return fact(a-1)*a;
	}
	

}
