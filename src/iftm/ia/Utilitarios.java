package iftm.ia;

import java.util.ArrayList;

public class Utilitarios {
	
	public static float retornaHeuristica(ArrayList<Integer> entrada)
	{
		int acertos = 0;
		for (int i = 0; i < 9; i++) {
			if(entrada.get(i) == (i+1))
				acertos++;
		}
		float resul = acertos/8;
		return (resul);
	}
	
}
