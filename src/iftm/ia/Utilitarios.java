package iftm.ia;

import java.util.ArrayList;
import java.util.Collections;

public class Utilitarios {
	
	public Integer[][] embaralhaJogo()
	{
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) 
			numeros.add(i);
		
		Collections.shuffle(numeros);
		
		Integer[][] resul = new Integer[3][3];
		int num = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				resul[i][j] = numeros.get(num);
				num++;
			}
		return resul;
	}
	
	public Integer[] achaZero(Integer mat[][])
	{
		Integer[] pos = new Integer[2];
		
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if(mat[i][j] == 0)
				{
					pos[0] = i;
					pos[1] = j;
				}	
			}
		return pos;
	}
	
	public int quantFilhos(int x, int y)
	{
		if(x == 0 && y == 0)
			return 2;
		if(x == 0 && y == 1)
			return 3;
		if(x == 0 && y == 2)
			return 2;
		if(x == 1 && y == 0)
			return 3;
		if(x == 1 && y == 1)
			return 4;
		if(x == 1 && y == 2)
			return 3;
		if(x == 1 && y == 0)
			return 2;
		if(x == 1 && y == 1)
			return 3;
		if(x == 1 && y == 2)
			return 2;
		
		return 0;
	}
	
	/*public ArrayList<Integer> retornaFilhos(int x, int y)
	{
		
	}*/
	
}
