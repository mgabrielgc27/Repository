package JavaLar;

import java.util.ArrayList;

import Astros.Astros;
import Planetas.C;
import Planetas.Cplus;
import Planetas.Csharp;
import Planetas.JavaScript;
import Planetas.PHP;
import Planetas.PlanetasLinguagens;
import Planetas.Python;
import Planetas.Ruby;

public class EstrelaJava {

	protected String nome = "JAVA";
	protected int posicaoX = 8;
	protected int pocicaoY = 8;
	protected int tempoTotal = 0;
	protected ArrayList<PlanetasLinguagens> planetas = new ArrayList<PlanetasLinguagens>();
	protected ArrayList<Astros> astros = new ArrayList<Astros>();

	public EstrelaJava() {
		planetas.add(new Python("Python", 1));
		planetas.add(new JavaScript("Java Script", 2));
		planetas.add(new Ruby("Ruby On Rails", 3));
		planetas.add(new PHP("PHP", 4));
		planetas.add(new Csharp("C#", 5));
		planetas.add(new Cplus("C++", 6));
		planetas.add(new C("C", 7));
	}
	
	public boolean verificarSeTodosExplodiram() {
		boolean todosMortos = false;
		for (PlanetasLinguagens p : planetas) {
			if(p.isExplodiu())
				todosMortos = true;
			else
				todosMortos = false;
		}
		if(todosMortos)
			System.out.println("Todos os planetas EXPLODIRAM.\n");
		return todosMortos;		
	}

	public void verificarColisoes() {
		excluirCorposNulos();
		for (Astros a : astros) {
			a.modificarVelocidade(planetas);
		}
	}

	private void excluirCorposNulos() {
		for (int i = 0; i < astros.size(); i++) {
			if (astros.get(i).isColidiu())
				astros.remove(i);
		}
	}

	public void movimentarPlanetas(int tempo) {
		for (PlanetasLinguagens p : planetas) {
			if (p.isExplodiu() == false) {
				p.translacionar(tempo);
				p.rotacionar(tempo);
			}
		}
	}

	public boolean verificarAlinhamentoVertical() {
		for (PlanetasLinguagens p : planetas) {
			if (p.getPosicaoY() != 8)
				return false;
		}
		return true;
	}

	public boolean verificarAlinhamentoDiagonalSecundadaria() {
		for (PlanetasLinguagens p : planetas) {
			if (p.getPosicaoX() != p.getPosicaoY())
				return false;
		}
		return true;
	}

	public boolean verificarAlinhamentoDiagonalPrincipal() {
		for (PlanetasLinguagens p : planetas) {
			if (p.getPosicaoY() != (16 - p.getPosicaoX()))
				return false;
		}
		return true;
	}

	public void calcularDistanciaEntreOsPlanetas() {
		float ladoX;
		float ladoY;
		int aux = 1;
		for (int i = 0; i < planetas.size(); i++) {
				for (int j = aux; j < planetas.size(); j++) {
					ladoX = (Math.abs(planetas.get(i).getPosicaoX() - planetas.get(j).getPosicaoX()) + 1);
					ladoY = (Math.abs(planetas.get(i).getPosicaoY() - planetas.get(j).getPosicaoY()) + 1);
					int area = (int) (ladoX * ladoY);
					float distancia = (float) Math.sqrt(Math.pow(ladoX, 2) + Math.pow(ladoY, 2));
					System.out.print("Distância entre " + planetas.get(i).getNome() + " e " + planetas.get(j).getNome()
							+ ": " + area);
					System.out.println("  -  Distância EUCLIDIANA: " + distancia + "");
				}
				aux++;
		}
		System.out.println();
	}

}
