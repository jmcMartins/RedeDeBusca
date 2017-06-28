package iftm.ia;

import java.util.ArrayList;
import java.util.Collections;

public class Utilitarios {
	
	public static ArrayList<Integer> começaJogo()
	{
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) 
			numeros.add(i);
		
		Collections.shuffle(numeros);
		
		return numeros;
	}
	
	public static int achaZero(ArrayList<Integer> entrada)
	{
		int pos = entrada.indexOf(0);
		return pos;
	}
	
	public static float retornaHeuristica(int x)
	{
		return (x/9);
	}
	
	public static Integer[][] retornaFilhos (Integer[] matriz, Integer x, Integer y, Integer qntFilhos){
		
		Integer[][] filhos = new Integer[qntFilhos][9];
		Integer temp1 = 0, temp2 = 0;
		Integer[] matrizFixa = matriz;
		
		if(x == 0 && y == 0)
		{
			matriz = matrizFixa;
			temp1 = matriz[0];
			temp2 = matriz[1];
			matriz[0] = temp2;
			matriz[1] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[0];
			temp2 = matriz[3];
			matriz[0] = temp2;
			matriz[3] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
		}
			
		if(x == 0 && y == 1)
		{
			matriz = matrizFixa;
			temp1 = matriz[1];
			temp2 = matriz[0];
			matriz[1] = temp2;
			matriz[0] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[1];
			temp2 = matriz[2];
			matriz[1] = temp2;
			matriz[2] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[1];
			temp2 = matriz[4];
			matriz[1] = temp2;
			matriz[4] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[2][i] = matriz[i];
		}
			
		if(x == 0 && y == 2)
		{
			matriz = matrizFixa;
			temp1 = matriz[2];
			temp2 = matriz[1];
			matriz[2] = temp2;
			matriz[1] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[2];
			temp2 = matriz[5];
			matriz[2] = temp2;
			matriz[5] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
		}
			
		if(x == 1 && y == 0)
		{
			matriz = matrizFixa;
			temp1 = matriz[3];
			temp2 = matriz[0];
			matriz[3] = temp2;
			matriz[0] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[3];
			temp2 = matriz[6];
			matriz[3] = temp2;
			matriz[6] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[3];
			temp2 = matriz[4];
			matriz[3] = temp2;
			matriz[4] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[2][i] = matriz[i];
		}
		
		if(x == 1 && y == 1)
		{
			matriz = matrizFixa;
			temp1 = matriz[4];
			temp2 = matriz[1];
			matriz[4] = temp2;
			matriz[1] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[4];
			temp2 = matriz[3];
			matriz[4] = temp2;
			matriz[3] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[4];
			temp2 = matriz[5];
			matriz[4] = temp2;
			matriz[5] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[2][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[4];
			temp2 = matriz[7];
			matriz[4] = temp2;
			matriz[7] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[3][i] = matriz[i];
		}
			
		if(x == 1 && y == 2)
		{
			matriz = matrizFixa;
			temp1 = matriz[5];
			temp2 = matriz[2];
			matriz[5] = temp2;
			matriz[2] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[5];
			temp2 = matriz[4];
			matriz[5] = temp2;
			matriz[4] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[5];
			temp2 = matriz[8];
			matriz[5] = temp2;
			matriz[8] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[2][i] = matriz[i];
		}
			
		if(x == 2 && y == 0)
		{
			matriz = matrizFixa;
			temp1 = matriz[6];
			temp2 = matriz[3];
			matriz[6] = temp2;
			matriz[3] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[6];
			temp2 = matriz[7];
			matriz[6] = temp2;
			matriz[7] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
		}
			
		if(x == 2 && y == 1)
		{
			matriz = matrizFixa;
			temp1 = matriz[7];
			temp2 = matriz[6];
			matriz[7] = temp2;
			matriz[6] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[7];
			temp2 = matriz[4];
			matriz[7] = temp2;
			matriz[4] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[7];
			temp2 = matriz[8];
			matriz[3] = temp2;
			matriz[4] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[2][i] = matriz[i];
		}
			
		if(x == 2 && y == 2)
		{
			matriz = matrizFixa;
			temp1 = matriz[8];
			temp2 = matriz[7];
			matriz[8] = temp2;
			matriz[7] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[0][i] = matriz[i];
			
			matriz = matrizFixa;
			temp1 = matriz[8];
			temp2 = matriz[5];
			matriz[8] = temp2;
			matriz[5] = temp1;
			for (int i = 0; i < 9; i++) 
				filhos[1][i] = matriz[i];
		}
			
		return filhos;
	}
	
}
