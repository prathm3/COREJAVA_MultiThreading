package com.demo.threads;

import com.demo.beans.MyNunmFunc;

public class FactThread extends Thread {
	private MyNunmFunc ob;
	private int n;
	public FactThread(MyNunmFunc ob, int n) {
			this.ob = ob;
			this.n = n;
	}
	public void run() {
		int num = ob.fact(n);
		System.out.println("Fact" + num);
	}
}
