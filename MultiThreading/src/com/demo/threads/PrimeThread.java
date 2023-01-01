package com.demo.threads;

import com.demo.beans.MyNunmFunc;

public class PrimeThread extends Thread{
	MyNunmFunc ob;
	int n;
	public PrimeThread(MyNunmFunc ob, int n) {
		this.ob = ob;
		this.n = n;
	}
	public void run() {
		System.out.println(ob.prime(n));
	}
}
