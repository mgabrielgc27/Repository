package Astros;

import java.util.ArrayList;
import java.util.Random;

import Planetas.PlanetasLinguagens;

public abstract class Astros {
	protected String tipo;
	protected int posicaoX;
	protected int posicaoY;
	protected boolean colidiu = false;

	public Astros() {
		do {
			posicaoX = (new Random().nextInt(15) + 1);
			posicaoY = (new Random().nextInt(15) + 1);
		} while (posicaoX == 8 && posicaoY == 8);
	}

	public abstract void modificarVelocidade(ArrayList<PlanetasLinguagens> p);

	public String getTipo() {
		return tipo;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public boolean isColidiu() {
		return colidiu;
	}
}
