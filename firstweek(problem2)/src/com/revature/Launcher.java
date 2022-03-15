package com.revature;

import java.util.EmptyStackException;
import java.util.Stack;

public class Launcher {

	public static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {

	pushing();
	for (int i = 0; i<14; i++) {
		popping();
	}
	getMax();
	
//	System.out.println(stack);
		
	}
	
	public static Integer popping() throws EmptyStackException {
		int k = 0;
		
		if (stack.size() == 0) {
			try {
			throw new EmptyStackException();
			} catch (Exception e) {
				System.out.println("Stack is Empty");
			}
		} else {
			k = stack.pop();
			System.out.println(stack);
		}
		return k;
	}
	
	public static void pushing(){

		for (int i=10; i<13; i++) {
			stack.push(i);
			for (int j = 15; j>10; j--) {
				stack.push(j);
			}
		}
	System.out.println(stack);
		
	
	}
	
	public static Integer getMax() throws EmptyStackException{
		
		int k = 0;
//		System.out.println(k);
		if (stack.size() == 0) {
			try {
			throw new EmptyStackException();
			} catch (Exception e) {
				System.out.println("Stack is Empty");
			}
		} else {
			for (int i=0; i<stack.size(); i++) {
				if (stack.get(i) >= k) {
					k = stack.get(i);
				}
			}
			System.out.println(k);
		}
		return k;
	}
		
		
	
	

}
