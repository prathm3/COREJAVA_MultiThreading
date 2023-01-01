package com.demo.threads;

import com.demo.beans.Table;

public class TableThread extends Thread {
	Table ob;
	int n;
	public TableThread(Table on, int num) {
		ob = on;
		n = num;
	}
	public void run() {
		ob.find(n);
	}
}
