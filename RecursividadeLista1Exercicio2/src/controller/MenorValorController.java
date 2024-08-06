package controller;

public class MenorValorController {
	public MenorValorController() {
		super();
	}
	
	public int menor(int[] vet, int tamanho, int ultimaPos) {
		//Condição de Parada: Se o tamanho do vetor for 0, a menor posição obtida é retornada através da variavel ultimaPos
		if(tamanho == 0) {
			return ultimaPos;
		}
		
		//Chamada dos Passos: Se o último elemento do vetor for menor que o valor de ultimaPos, o valor do ultimo elemento é atribuido para ultimaPos. Chama-se a função recursivamente para o subvetor restante.
		
		if(vet[tamanho - 1] < ultimaPos) {
			ultimaPos = vet[tamanho-1];
		}
		
		return menor(vet, tamanho - 1, ultimaPos);
	}
}
