package iftm.ia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static No melhor = null;
	
	public static void main(String[] args) 
	{	
		Integer[] tabuleiro = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(tabuleiro));
		
		Collections.shuffle(array); //Bagunça array.
		
		No arvore = new No();
		melhor = arvore;
		arvore.filhotes = array;
		
		arvore.nivel = 1;
		
		arvore.criarFilhos();
		
		arvore.print();
		
		System.out.println("Melhor Heuristica: ");
		System.out.println("Nivel: "+ melhor.nivel + " | No: " + melhor.id + " | Heuristica: " + melhor.retornaHeuristica() + "%");
		for (int i = 0; i < melhor.filhotes.size(); i++) {
			System.out.print(melhor.filhotes.get(i)+" ");
			if((i+1) % 3 == 0)
				System.out.println();
		}
		System.out.println("\n");
	}
}
