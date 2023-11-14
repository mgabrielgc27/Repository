package Astros;

import java.util.ArrayList;

import Planetas.PlanetasLinguagens;

	public class Dev extends Astros {
		public Dev() {
		tipo = "DEV";
	}

	public void modificarVelocidade(ArrayList<PlanetasLinguagens> planetas) {
		
		for (PlanetasLinguagens p : planetas) {
			
			if (posicaoX == p.getPosicaoX() && posicaoY == p.getPosicaoY()) {
				
				if (colidiu == false) {
					
					p.setQuantColisoesComDevs(p.getQuantColisoesComDevs() + 1);
					System.out.println(
							"DEV colidiu com " + p.getNome() + " na posição (" + posicaoX + ", " + posicaoY + ") ");
					System.out.println(p.getNome() + " ganhou velocidade!");
					p.setVelocidade(p.getVelocidade() + 1);
					colidiu = true;
					
				}
				
			}
			
		}
		
	}

}
