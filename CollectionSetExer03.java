package com.igor.cursojava.aula06collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CollectionSetExer03 {

	public static void main(String[] args) {
		
		int numeros;
		
		List<Integer> meuset = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 10 números inteiros não repetidos: ");
		for(int i=0; i<10; i++) {
			numeros = scan.nextInt();
			meuset.add(numeros);
			
			}

	Collections.sort(meuset);
	Iterator<Integer> imeuset = meuset.iterator();
	
	System.out.println("Listar dados do set: ");

	while(imeuset.hasNext()) {
		System.out.println(imeuset.next());
	}
	}


}


