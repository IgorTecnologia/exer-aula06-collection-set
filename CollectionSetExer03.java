package com.igor.cursojava.aula06collections;

import java.util.*;

public class CollectionSetExer03 {

	public static void main(String[] args) {
		
		int numeros;
		
		Set<Integer> meuset = new HashSet<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 10 números inteiros não repetidos: ");
		for(int i=0; i<10; i++) {
			numeros = scan.nextInt();
			meuset.add(numeros);
			
			}

	Iterator<Integer> imeuset = meuset.iterator();
	
	System.out.println("Listar dados do set: ");

	while(imeuset.hasNext()) {
		System.out.println(imeuset.next());
	}
	}


}


