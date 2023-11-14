package JavaLar;

import java.util.ArrayList;
import java.util.Scanner;

import Astros.Astros;
import Planetas.PlanetasLinguagens;

public class Menu {

	private Scanner entrada = new Scanner(System.in);
	private EstrelaJava java = new EstrelaJava();
	private ArrayList<Rodada> rodadas = new ArrayList<Rodada>();

	public Menu() {

		System.out.println("Seja BEM VINDO ao Sistema JavaLar");
		imprimirDadosPlanetas(java.planetas);

		int opcao = 0;
		do {
			
			if(java.verificarSeTodosExplodiram())
				finalizarPrograma();
			else {
				System.out.println("Digite [1] para INICIAR uma rodada");
				System.out.println("Digite [2] para SAIR do programa");
				opcao = entrada.nextInt();

				switch (opcao) {
				case 1:
					iniciarRodada();
					break;
				case 2:
					finalizarPrograma();
					break;
				default:
					System.out.println("Opção invalida, Digite novamente.");
					break;
				}

			}
			
		} while (opcao != 2);
		
	}

	public void iniciarRodada() {

		System.out.print("Digite um TEMPO: ");
		int tempo = entrada.nextInt();
		java.tempoTotal += tempo;
		System.out.print("Digite quantos BUGs devem ser criados: ");
		int quantBugs = entrada.nextInt();
		System.out.print("Digite quantos DEVs devem ser criados: ");
		int quantDevs = entrada.nextInt();

		Rodada rodada = new Rodada(tempo, quantBugs, quantDevs);
		rodada.adicionarAstros(java);
		imprimirPosAstros(java.astros);
		java.verificarColisoes();
		java.movimentarPlanetas(tempo);
		imprimirDadosPlanetas(java.planetas);
		imprimirQuantPlanetasNorteSul(java.planetas);
		imprimirSeHouverAlinhamento(java);
		java.calcularDistanciaEntreOsPlanetas();
		rodada.setJava(java);
		rodadas.add(rodada);

	}

	private void finalizarPrograma() {
		imprimirQuantidadeDeBugsDevsColidiram(java.planetas);
		imprimirNomeVelocidadesDosPlanetas(java.planetas);
		imprimirPlanetasExplodidos(java.planetas);
		imprimirDiasHorasPlanetas(java.planetas);
		System.out.println("Total de instantes solicitados pelo usuário: " + java.tempoTotal);
		imprimirDescricaoPlanetas(java.planetas);
		System.out.print("\nSistema Encerrado.");
	}
	
	private void imprimirDescricaoPlanetas(ArrayList<PlanetasLinguagens> planetas) {
		System.out.println("\nDescrição dos Planetas\n");
		for (PlanetasLinguagens p : planetas) {
			System.out.println(p.getInformacoes());
		}
	}

	private void imprimirDadosPlanetas(ArrayList<PlanetasLinguagens> planetas) {
		System.out.println("\nDados dos planetas\n");
		for (PlanetasLinguagens p : planetas) {
			System.out.print(
					"[" + p.getNome() + "]  -  Posição: " + " (" + p.getPosicaoX() + ", " + p.getPosicaoY() + ")");
			System.out.printf("  -  Velodidade de translação: %.2f", (float) p.getVelocidade());
			System.out.printf("  -  Horas passadas: %.2f\n", p.getHorasPassadas());
		}
		System.out.println();
	}

	private void imprimirPosAstros(ArrayList<Astros> astros) {
		int i = 0;
		int j = 1;
		System.out.println("Posições dos BUGs e DEVs");
		for (Astros a : astros) {
			if (i == (10 * j)) {
				System.out.println();
				j++;
			}
			System.out.print(a.getTipo() + "(" + a.getPosicaoX() + " ," + a.getPosicaoY() + ")  ");
			i++;
		}

		System.out.println("\n");
	}

	private void imprimirQuantPlanetasNorteSul(ArrayList<PlanetasLinguagens> planetas) {
		int quantNorte = 0;
		int quantSul = 0;
		for (PlanetasLinguagens p : planetas) {
			if(p.isExplodiu() == false)
				if (p.getPosicaoX() > 8)
					quantNorte++;
				else if (p.getPosicaoX() < 8)
					quantSul++;
		}
		System.out.println("Planetas ao NORTE: " + quantNorte);
		System.out.println("Planetas ao SUL: " + quantSul);
		System.out.println();
	}

	private void imprimirSeHouverAlinhamento(EstrelaJava j) {
		if (j.verificarAlinhamentoDiagonalPrincipal())
			System.out.println("Planetas ALINHADOS na diagonal principal.");
		else
			System.out.println("Planetas NÃO alinhados na diagonal principal.");
		if (j.verificarAlinhamentoVertical())
			System.out.println("Planetas ALINHADOS verticalmente.");
		else
			System.out.println("Planetas NÃO alinhados verticalmente.");
		if (j.verificarAlinhamentoVertical())
			System.out.println("Planetas ALINHADOS na diagonal secundaria.");
		else
			System.out.println("Planetas NÃO alinhados na diagonal secundaria.");
		System.out.println();
	}

	private void imprimirQuantidadeDeBugsDevsColidiram(ArrayList<PlanetasLinguagens> planetas) {
		for (PlanetasLinguagens p : planetas) {
			if (p.getQuantColisoesComBugs() != 0)
				System.out.println(
						"Quantidade de colisões entre BUGs e " + p.getNome() + ": " + p.getQuantColisoesComBugs());
			if (p.getQuantColisoesComDevs() != 0)
				System.out.println(
						"Quantidade de colisões entre DEVs e " + p.getNome() + ": " + p.getQuantColisoesComDevs());
		}
		System.out.println();
	}

	private void imprimirNomeVelocidadesDosPlanetas(ArrayList<PlanetasLinguagens> planetas) {
		for (PlanetasLinguagens p : planetas) {
			try {
				System.out.printf(
						"\nNome: %s  -  Velocidade de rotação: %.2f   -  Velocidade Média de Translação: %.2f",
						p.getNome(), p.getVelocidadeRotacao(), (float) (p.getDeslocamentoTotal() / java.tempoTotal));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();
	}

	private void imprimirPlanetasExplodidos(ArrayList<PlanetasLinguagens> planetas) {
		System.out.println("\nPlanetas que explodiram");
		int aux = 0;
		for (PlanetasLinguagens p : planetas) {
			if (p.isExplodiu()) {
				System.out.println(p.getNome());
				aux++;
			}
		}
		if (aux == 0)
			System.out.println("Nenhum.");

		System.out.println();
	}

	private void imprimirDiasHorasPlanetas(ArrayList<PlanetasLinguagens> planetas) {
		int anos = 0;
		for (PlanetasLinguagens p : planetas) {
			anos = (p.getDeslocamentoTotal() / (8 * p.getDistancia()));
			System.out.printf("Passaram-se  %.2f horas e %d anos em %s\n", p.getHorasPassadas(), anos, p.getNome());
		}
		System.out.println();
	}
}
