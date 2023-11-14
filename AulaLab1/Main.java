package AulaLab1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String pedidos = "Pedidos Totais\n";
		
		int resposta = 1;
		do {
			int contador = 0;
			
			Aluno aluno[] = new Aluno[100];
			aluno[contador] = new Aluno();
			aluno[contador].fazerPedido();
			
			pedidos += "Nome: " + aluno[contador].nome + " Matricula: " + aluno[contador].matricula + " Pediu um ";
			
			
			Vendas venda[] = new Vendas[100];
			venda[contador] = new Vendas();
			System.out.println(venda[contador].montarPedido(aluno[contador].QuantDePedidos, aluno[contador]));
			
			pedidos += venda[contador].montarPedido(aluno[contador].QuantDePedidos, aluno[contador]); 
			
			contador++;
			
			System.out.println("Deseja sair do sistema? Digite [1] sim ou [2] não");
			resposta = entrada.nextInt();
		} while (resposta == 2);

		entrada.close();
		System.out.println(pedidos);
	}

}
