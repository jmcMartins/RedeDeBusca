package iftm.ia;

public class Main {

	public static void main(String[] args) {
		
		Utilitarios util = new Utilitarios();
		
		Integer[][] saida = util.embaralhaJogo();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(saida[i][j]);
			}
		}

	}

}
