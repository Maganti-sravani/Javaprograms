package com.edu;
import java.util.Scanner;
public class Fatcors {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		num = scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
			
		}
        if(c==2) {
        	System.out.println(num+" is prime number");
        }
        else {
        	System.out.println(num+" is not prime number");
        }
	}

}
