package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyNunmFunc;
import com.demo.threads.FactThread;
import com.demo.threads.PrimeThread;

public class TestMyFunc {

	public static void main(String[] args) {
		FactThread[] fact = new FactThread[5];
		Scanner sc = new Scanner(System.in);
		PrimeThread[] prime = new PrimeThread[5];
		MyNunmFunc ob = new MyNunmFunc();
		for(int i=0; i<5; i++) {
			System.out.println("ENter num");
			int n = sc.nextInt();
			fact[i] = new FactThread(ob, n);
			fact[i].start();
			prime[i] = new PrimeThread(ob, n);
			prime[i].start();
		}
		for(int i=0; i<5; i++) {
			try {
				prime[i].join();
				fact[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
