package exercicios061016;

public class Treino {
	public Treino() {
		System.out.println(exercicio2());
	}
	
	private void exercicio1(){

	    int pontosLeixoes = 45,pontosFeirense = 76,pontosPorto = 33,pontosAves = 67;

	}
	
	private int exercicio2(){
		int[] pontosFora={45, 76, 33, 67};
		int soma=0;
		System.out.println(pontosFora[2]);
		for(int i=0;i<pontosFora.length;i++){
			soma +=pontosFora[i];
		}
		return soma;
	}
}
