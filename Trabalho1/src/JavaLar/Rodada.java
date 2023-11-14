package JavaLar;

import Astros.Bug;
import Astros.Dev;

public class Rodada {

	private EstrelaJava java;
	private int tempoDoInst;
	private int quantBugs;
	private int quantDevs;

	public Rodada(int tempoDoInst, int quantBugs, int quantDevs) {
		this.tempoDoInst = tempoDoInst;
		this.quantBugs = quantBugs;
		this.quantDevs = quantDevs;
	}

	public void adicionarAstros(EstrelaJava java) {
		for (int i = 0; i < quantBugs; i++) {
			Bug b = new Bug();
			java.astros.add(b);
		}
		for (int i = 0; i < quantDevs; i++) {
			Dev d = new Dev();
			java.astros.add(d);
		}
		System.out.println("\nForam adicionados " + quantBugs + " BUGs.");
		System.out.println("Foram adicionados " + quantDevs + " DEVs.");
	}

	public void setJava(EstrelaJava java) {
		this.java = java;
	}

	public int getTempoDoInst() {
		return tempoDoInst;
	}

	public void setTempoDoInst(int tempoDoInst) {
		this.tempoDoInst = tempoDoInst;
	}

	public int getQuantBugs() {
		return quantBugs;
	}

	public void setQuantBugs(int quantBugs) {
		this.quantBugs = quantBugs;
	}

	public int getQuantDevs() {
		return quantDevs;
	}

	public void setQuantDevs(int quantDevs) {
		this.quantDevs = quantDevs;
	}

}
