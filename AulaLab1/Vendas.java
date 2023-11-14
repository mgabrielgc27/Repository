package AulaLab1;

public class Vendas {
	
	public Aluno aluno = new Aluno();	
	Print print = new Print();
	public int QuantDePedidosTotal;

	public String montarPedido(int QuantDePedidos, Aluno aluno) {
		String pedido = "";

			pedido += "Cachorro Quente com";

			if (aluno.hotdog.proteina == 1)
				pedido += " salsicha";
			else if (aluno.hotdog.proteina == 2)
				pedido += " linguiça";
			else if (aluno.hotdog.proteina == 3)
				pedido += " frango";
			else if (aluno.hotdog.proteina == 4)
				pedido += " bacon";
			else
				System.out.println(print.escolhaInvalida());

			if (aluno.hotdog.queijo == 1)
				pedido += ", queijo mussarela ";
			else if (aluno.hotdog.queijo == 2)
				pedido += ", queijo prato ";
			else if (aluno.hotdog.queijo == 3)
				pedido += ", queijo parmesão ";
			else if (aluno.hotdog.queijo == 4)
				pedido += ", queijo coalho ";
			else
				System.out.println(print.escolhaInvalida());

			for (int i = 0; i < 4; i++) {
				if (aluno.hotdog.adicionais[i] == 1)
					pedido += ", maionese ";
				else if (aluno.hotdog.adicionais[i] == 2)
					pedido += ", ketchup ";
				else if (aluno.hotdog.adicionais[i] == 3)
					pedido += ", ovo ";
				else if (aluno.hotdog.adicionais[i] == 4)
					pedido += ", batata frita ";
			
			}

			if (aluno.bebida.tipo == 1)
				pedido += "e Coca-cola\n";
			else if (aluno.bebida.tipo == 2)
				pedido += "e Del Rio\n";
			else if (aluno.bebida.tipo == 3)
				pedido += "e o Suco do Chave\n";
			else
				System.out.println(print.escolhaInvalida());
			
			QuantDePedidosTotal++;
		
		return pedido;
	}
}
