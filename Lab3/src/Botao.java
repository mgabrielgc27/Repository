import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Botao extends JButton{
	
	public Botao(String texto, Color cor, int largura, int altura) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setSize(largura, altura);
//		setFont(new Font("arial", Font.BOLD, 50));
	}
	
}
