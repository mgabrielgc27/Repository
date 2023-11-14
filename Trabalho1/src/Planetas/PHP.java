package Planetas;

public class PHP extends PlanetasLinguagens{

	public PHP(String nome, int distancia) {
		super(nome, distancia);
		this.velocidade = 2;
		this.velocidadeRotacao = 60;
		this.posicaoX = (8 + distancia);
		this.informacoes = "PHP é uma linguagem interpretada livre, usada originalmente apenas para o desenvolvimento de aplicações\r\n"
				+ " presentes e atuantes no lado do servidor, capazes de gerar conteúdo dinâmico na World Wide Web. Criado\r\n"
				+ " por Rasmus Lerdorf em 1995. O código é interpretado no lado do servidor pelo módulo PHP, que também gera\r\n"
				+ " a página web a ser visualizada no lado do cliente. A linguagem evoluiu, passou a oferecer funcionalidades\r\n"
				+ " em linha de comando, e além disso, ganhou características adicionais, que possibilitaram usos adicionais\r\n"
				+ " do PHP, não relacionados a web sites.\r\n";
	}

}
