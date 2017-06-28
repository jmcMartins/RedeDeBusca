package iftm.ia;

import java.util.ArrayList;

import iftm.ia.No;

public class No 
{
	public ArrayList<No> filhos = new ArrayList<No>();
	public static int NIVEL = 0;
	public ArrayList<Integer> filhotes = new ArrayList<Integer>();
	
	public No() 
	{
		
	}
	
	public void jogar(String opc)
	{
		int posZero = this.filhotes.indexOf(0);
		Integer temp1 = 0, temp2 = 0;
		
		switch(opc)
		{
			case "direita":
				if(posZero != 2 && posZero != 5 && posZero != 8){
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero+1);
					
					this.filhotes.set(posZero, temp2);
					this.filhotes.set(posZero+1, temp1);
					
				
				}
				break;
			case "esquerda":
				if(posZero != 0 && posZero != 3 && posZero != 6){
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero-1);
					
					this.filhotes.set(posZero, temp2);
					this.filhotes.set(posZero-1, temp1);
					
					
				}	
				break;
			case "cima":
				if(posZero > 2 ){
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero-3);
					
					this.filhotes.set(posZero, temp2);
					this.filhotes.set(posZero-3, temp1);
					
					
				}
				break;
			case "baixo":
				if(posZero < 6){
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero+3);
					
					this.filhotes.set(posZero, temp2);
					this.filhotes.set(posZero+3, temp1);
					
					
				}
				break;
		}
	}
	
	
}

