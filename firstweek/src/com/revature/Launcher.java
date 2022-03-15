package com.revature;

import java.util.LinkedList;
import java.util.Scanner;

public class Launcher {

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		LinkedList<Integer> listA = new LinkedList<>();
		LinkedList<Integer> listB = new LinkedList<>();
		int answer = 0;
		
		System.out.println("Size of LinkedList A: ");
		int m = scan.nextInt ();
		scan.nextLine();
		System.out.println("Values for LinkedList A: ");
		for (int i = 0; i<m; i++) {
			int a = scan.nextInt ();
			listA.add(a);
		}
		
		System.out.println("Size of LinkedList B: ");
		int n = scan.nextInt ();
		scan.nextLine();
		System.out.println("Values for LinkedList A: ");
		for (int i = 0; i<m; i++) {
			int a = scan.nextInt ();
			listB.add(a);
		}
		
		outerloop:
		for (int i = 0; i<Math.max(m, n); i++) {
			for (int j = 0; j<Math.min(m, n); j++) {
				if (listA.get(i) == listB.get(j)) {
					answer = listA.get(i);
					System.out.println(answer);
					break outerloop;
					
				}
			}
		}
		
		
	}
	
	

}
