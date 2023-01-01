package com.demo.beans;

public class MyNunmFunc {
	public int fact(int n) {
		int ans = 1;
		for(int i=1; i<=n; i++) {
			ans *= i;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ans;
	}
	public boolean prime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i == 0) return false;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}
}
