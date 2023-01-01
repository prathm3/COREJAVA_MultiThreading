package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Table;
import com.demo.threads.TableThread;

public class TestTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Table ob = new Table();
		TableThread t1 = new TableThread(ob, 7);
		TableThread t2 = new TableThread(ob, 9);
		t1.start();
		t2.start();
		 try {
			 t2.join();
			 t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
