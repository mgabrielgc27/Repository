package Astros;

import java.util.ArrayList;

import Planetas.PlanetasLinguagens;

	public class Bug extends Astros {
		public Bug() {
		tipo = "BUG";
	}

	public void modificarVelocidade(ArrayList<PlanetasLinguagens> planetas) {
		
		for (PlanetasLinguagens p : planetas) {
			
			if (posicaoX == p.getPosicaoX() && posicaoY == p.getPosicaoY()) {
				
				if (colidiu == false) {
					
					p.setQuantColisoesComBugs(p.getQuantColisoesComBugs() + 1);
					System.out.println(
							"BUG colidiu com " + p.getNome() + " na posição (" + posicaoX + ", " + posicaoY + ") ");
					System.out.println(p.getNome() + " perdeu velocidade!");
					p.setVelocidade(p.getVelocidade() - 1);
					colidiu = true;
					
					if (p.getVelocidade() <= 0) {
						
						p.setExplodiu(true);
						System.out.println(p.getNome() + " EXPLODIU!");
						p.setPosicaoX(0);
						p.setPosicaoY(0);
						
					}
					
				}
				
			}
			
		}
		
	}
	
}
