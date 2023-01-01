package com.demo.beans;

public class Table {
	public void find(int n) {
		for(int i=1; i<10; i++) {
			System.out.println(n + "*" + i + " = " + (n*i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
