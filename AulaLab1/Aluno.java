package AulaLab1;

import java.util.Scanner;

public class Aluno {
	public String nome;
	public int matricula;
	public int QuantDePedidos;
	HotDog hotdog = new HotDog();
	Bebida bebida = new Bebida();
	Print print = new Print();
	Scanner entrada = new Scanner(System.in);

	public void fazerPedido() {

		System.out.println(print.perguntaNome());
		this.nome = entrada.next();

		System.out.println(print.perguntaMatricula());
		this.matricula = entrada.nextInt();

//		System.out.println(print.perguntaQuantidadeDePedidos());
//		QuantDePedidos += entrada.nextInt();

		System.out.println(print.perguntaProteina());
		hotdog.proteina = entrada.nextInt();

		System.out.println(print.perguntaQueijos());
		hotdog.queijo = entrada.nextInt();

		int contador = 0;
		int resposta = 0;
		do {

			System.out.println(print.perguntaAdicionais());
			hotdog.adicionais[contador] = entrada.nextInt();
			contador++;

			System.out.println(print.perguntaEscolherMais());
			resposta = entrada.nextInt();

			if (contador == 4)
				System.out.println(print.avisaQuerDemais()+"\n");

		} while (resposta == 1 && contador < 4);

		System.out.println(print.perguntaBebida());
		bebida.tipo = entrada.nextInt();

		System.out.println(print.pedidoFeito());

	}
}
