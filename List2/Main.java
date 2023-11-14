package List2;

public class Main {

	public static void main(String[] args) {

		Utilidades utilidades = new Utilidades();

		// Questao 1
		int vet[] = { 10, 45, 76, 12, 76, 89, 10, 10, 10, 10 };
		System.out.println("Somatorio: " + utilidades.retornarSomatorio(vet));

		// Questao 2
		utilidades.retornarPares(0, 20);

		// Questao 3
		int vet2[] = { 34, 65, 87, 9, 10 };
		System.out.println("\nMedia: " + utilidades.retornarMedia(vet, vet2));

		// Questao 4
		int notas[] = { 7, 8, 6 };
		int pesos[] = { 2, 3, 1 };
		System.out.println("Media Ponderada: " + utilidades.retornarMediaPonderada(notas, pesos));

		// Questao 5
		int numero = 10;
		System.out.println(
				"O numero " + numero + " apareceu " + utilidades.contaElementos(vet, vet2, numero) + " vez(es)");

		// Questao 6
		int vetorCopia[] = utilidades.retornarVetorCopia(vet);
		System.out.println("Vetor Copia");
		for (int i : vetorCopia) {
			System.out.print(i + " ");
		}
		
		// Questao 7
		int vetorOrdenado[] = utilidades.ordenaVetor(vet);
		System.out.println("\nOrdena Vetor");
		for (int i : vetorOrdenado) {
			System.out.println(i + " ");
		}
		
		// Questao 8
		int vetorDesordenado[] = {9,8,7,6,5,4,3,2,1};
		int vetorDesordenado2[] = {1,2,3,4,5,9,8,7,6};
		String string = "";
		if(utilidades.verificaOrdenação(vetorDesordenado2))
			string = "ordenado\n";
		else
			string = "não ordenado\n";
		System.out.print("Vetor é "+ string);
		
		// Questao 9
		int vetor[] = {6,87,43,10,11,1,2,3};
		System.out.println("K maior valor: "+ utilidades.retornaKesimoMaior(vetor, 2));
		
		// Questao 10
		System.out.println("K menor valor: "+ utilidades.retornaKesimoMenor(vetor, 4));
		
		//Questao 11
		if(utilidades.verificaIgualdade(vetorOrdenado, vet))
			System.out.println("Vetores iguais");
		else
			System.out.println("Vetores diferentes");
		
		// Questao 12
		int base = 4;
		int expoente = 10;
		int numero1 = utilidades.potencia(base, expoente);
		System.out.println(base + " * " + expoente + " = " + numero1);
		
		// Questao 13
		int numeroteste = 53;
		if(utilidades.primo(numeroteste))
			System.out.println("É primo");
		else
			System.out.println("Não é primo");
		
		// Questao 14
		int vetorteste1[] = {10,4,56,1,6,2,7,8,9,2};
		int vetorteste2[] = {1,5,6,56,4,3,13,12,9,10};
		int vetorteste[] = utilidades.buscaOcorrencia(vetorteste1, vetorteste2);
		for (int i : vetorteste) {
			if(i != 0)
				System.out.println(i);
		}
		
		// Questao 15
		int vetorteste3[] = utilidades.remocao(vetorteste1, 2);
		for (int i : vetorteste3) {
			System.out.println(i);
		}
	}

}
