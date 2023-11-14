import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PaginaInicial extends JFrame{
	
	public PaginaInicial() {
		organizador();
		setTitle("Barraca de Cachorro Quente");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void organizador() {
		Opcoes telasuperior = new Opcoes();
		TelaDeInformacao telainferior = new TelaDeInformacao();
		add(telasuperior, BorderLayout.NORTH);
		add(telainferior, BorderLayout.CENTER);
	}
	
}
