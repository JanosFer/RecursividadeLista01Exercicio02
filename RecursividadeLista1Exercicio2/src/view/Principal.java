package view;

import controller.MenorValorController;

public class Principal {
	public static void main(String[] args) {
		MenorValorController mv = new MenorValorController();
		
		int[] vet = {-5, 1, 9, 33, 8, -4, 22};
		int tamanho = 7;
		
		System.out.println(mv.menor(vet, tamanho, vet[tamanho-1]));
	}
}
