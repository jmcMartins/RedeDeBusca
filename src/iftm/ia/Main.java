package iftm.ia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Integer[] tabuleiro = {0,1,2,3,4,5,6,7,8};
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(tabuleiro));
		
		Collections.shuffle(array);
		
		No arvore = new No();
		
		arvore.filhotes = array;
		
		arvore.nivel = 1;
		
		arvore.criarFilhos();
		
		arvore.print();

	}

}
