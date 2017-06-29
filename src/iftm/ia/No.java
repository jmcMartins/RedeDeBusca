package iftm.ia;

import java.util.ArrayList;
import iftm.ia.No;

public class No 
{
	public ArrayList<No> filhos = new ArrayList<No>();
	public ArrayList<Integer> filhotes = new ArrayList<Integer>();
	
	public static int NOS = 1, NIVEL = 0;
	
	public int id = 0, nivel = 0;
	
	public No() 
	{
		this.id = NOS++;
	}
	
	public void print()
	{
		System.out.println("Nivel: "+ this.nivel + " | No: " + this.id + " | Heuristica: ");
		for (int i = 0; i < filhotes.size(); i++) {
			System.out.print(filhotes.get(i)+" ");
			if((i+1) % 3 == 0)
				System.out.println();
		}
		System.out.println("\n");
		
		for (int i = 0; i < filhos.size(); i++) {
			filhos.get(i).print();
		}
	}
	
	public void criarFilhos()
	{
		this.jogar("direita");
		this.jogar("esquerda");
		this.jogar("cima");
		this.jogar("baixo");
		NIVEL++;
		
		if((this.nivel+1) < 15)
		{
			for (int i = 0; i < filhos.size(); i++) {
				filhos.get(i).criarFilhos();
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void jogar(String opc)
	{
		int posZero = this.filhotes.indexOf(0);
		Integer temp1 = 0, temp2 = 0;
		ArrayList<Integer> backup = null;
		
		switch(opc)
		{
			case "direita":
				if(posZero != 2 && posZero != 5 && posZero != 8){
					backup = (ArrayList<Integer>) this.filhotes.clone();
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero+1);
					
					backup.set(posZero, temp2);
					backup.set(posZero+1, temp1);
					No filho = new No();
					filho.filhotes = backup;
					filho.nivel = this.nivel +1;
					this.filhos.add(filho);
				}
				break;
			case "esquerda":
				if(posZero != 0 && posZero != 3 && posZero != 6){
					backup = (ArrayList<Integer>) this.filhotes.clone();
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero-1);
					
					backup.set(posZero, temp2);
					backup.set(posZero-1, temp1);
					No filho = new No();
					filho.filhotes = backup;
					filho.nivel = this.nivel +1;
					this.filhos.add(filho);
					
				}	
				
				break;
			case "cima":
				if(posZero > 2 ){
					backup = (ArrayList<Integer>) this.filhotes.clone();
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero-3);
					
					backup.set(posZero, temp2);
					backup.set(posZero-3, temp1);
					No filho = new No();
					filho.filhotes = backup;
					filho.nivel = this.nivel +1;
					this.filhos.add(filho);
					
				}
				
				break;
			case "baixo":
				if(posZero < 6){
					backup = (ArrayList<Integer>) this.filhotes.clone();
					temp1 = filhotes.get(posZero);
					temp2 = filhotes.get(posZero+3);
					
					backup.set(posZero, temp2);
					backup.set(posZero+3, temp1);
					No filho = new No();
					filho.filhotes = backup;
					filho.nivel = this.nivel +1;
					this.filhos.add(filho);
					
				}
				
				break;
		}
	}
	
	public float retornaHeuristica()
	{
		int acertos = 0;
		for (int i = 0; i < 9; i++) {
			if(this.filhotes.get(i) == (i+1))
				acertos++;
		}
		float resul = acertos/8;
		return (resul);
	}
	
	
	public void organizar() 
	{
		No filhote;
		for (int i = 0; i < this.filhos.size(); i++) {
			for (int j = (i+1); j < this.filhos.size(); j++) {
				if(this.filhos.get(i).retornaHeuristica() < this.filhos.get(j).retornaHeuristica()) 
				{
					filhote = this.filhos.get(i);
					this.filhos.set(i, this.filhos.get(j));
					this.filhos.set(j, filhote);
				}
			}
		}
	}
	
	
}

