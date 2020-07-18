package org.cap.demo;

public class SalesApp {

	int[] arr= {12,34,56,78,89};
	
	public void printdata() {
		int sumeven=0,sumodd=0,sum=0;
		for(int num:arr) {
			sum=sum+num;
			if(num%2==0)
				sumeven+=num;
			else 
				sumodd+=num;
		}
		System.out.println("Sum:" + sum);

		System.out.println("Even Sum:" + sumeven);
		System.out.println("Odd Sum:" + sumodd);
	}
}
