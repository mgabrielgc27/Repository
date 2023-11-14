package List2;

public class Utilidades {

	public int retornarSomatorio(int[] vet) {
		int soma = 0;

		for (int i = 2; i < (vet.length - 2); i++) {
			soma += vet[i];
		}

		return soma;
	}

	public void retornarPares(int numero1, int numero2) {
		System.out.println("Numeros Pares de " + numero1 + " a " + numero2);
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0 && i != 0)
				System.out.print(i + " ");
		}
	}

	public float retornarMedia(int[] vetor1, int[] vetor2) {
		float soma = 0;
		for (int i = 0; i < vetor1.length; i++) {
			soma += vetor1[i];
		}
		for (int i = 0; i < vetor2.length; i++) {
			soma += vetor2[i];
		}
		float media = soma / (vetor1.length + vetor2.length);
		return media;
	}

	public float retornarMediaPonderada(int[] notas, int[] pesos) {
		float soma = 0;
		int aux = 0;
		for (int i = 0; i < notas.length; i++) {
			aux += pesos[i];
			soma += (pesos[i] * notas[i]);
		}
		return (soma / aux);
	}

	public int contaElementos(int[] vetor1, int[] vetor2, int numero) {
		int contador = 0;
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] == numero)
				contador++;
		}
		for (int i = 0; i < vetor2.length; i++) {
			if (vetor2[i] == numero)
				contador++;
		}
		return contador;
	}
	
	public int[] retornarVetorCopia(int[] vetor) {
		int vetorCopia[] = new int[vetor.length];
		for (int i = 0; i < vetor.length; i++) {
			vetorCopia[i] = vetor[i];
		}
		return vetorCopia;
	}
	
	public int[] ordenaVetor(int[] vetor) {
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < (vetor.length-1); j++) {
				if( vetor[j] > vetor[j+1] ) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		return vetor;
	}
	
	public boolean verificaOrdenação(int[] vetor) {
		boolean ordenado = false;
		for (int j = 0; j < (vetor.length - 1); j++) {
			if (vetor[j] < vetor[j + 1] || vetor[j] == vetor[j + 1])
				ordenado = true;
			else
				return false;
		}
		return ordenado;
	}
	
	public int retornaKesimoMaior(int[] vetor, int K) {
		int vetorOrdenado[] = ordenaVetor(vetor);
		int Kmaior = vetorOrdenado[vetorOrdenado.length-K];
		return Kmaior;
	}
	
	public int retornaKesimoMenor(int[] vetor, int K) {
		int vetorOrdenado[] = ordenaVetor(vetor);
		int Kmenor = vetorOrdenado[K-1];
		return Kmenor;
	}
	
	public boolean verificaIgualdade(int[] vetor, int[] vetor2) {
		boolean iguais = false;
		for (int i = 0; i < vetor2.length; i++) {
			if(vetor[i] == vetor2[i])
				iguais = true;
			else
				return false;
		}
		return iguais;
	}
	
	public int potencia(int base, int expoente) {
		if (expoente == 0)
			return 1;
		if (expoente == 1)
			return base;
		int produto = base;
		for (int i = 1; i < expoente; i++) {
			produto = produto * base;
			
		}
		return produto;
	}
	
	public boolean primo(int numero) {		
		if (numero < 2)
			return false;
		else if (numero == 2)
			return true;
		else {
			for (int i = 2; i < (numero - 1); i++) {
				if (numero % i == 0)
					return false;
			}
		}
		return true;
	}
	
	public int[] buscaOcorrencia(int[] vetor1, int[] vetor2) {
		int vetor[] = new int[vetor1.length];
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if(vetor1[i] == vetor2[j])
					vetor[i] = vetor1[i];
			}
		}
		return vetor;
	}
	
	public int[] remocao(int[] vetor, int numero) {
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				vetor[i] = 0;
				aux++;
			}
		}
		int vetor1[] = new int[vetor.length - aux];
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor[i] != numero) {
				vetor1[i] = vetor[i];
			}			
		}
		return vetor1;
	}
	
}
