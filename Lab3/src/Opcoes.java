import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Opcoes extends JPanel{
	
	public Opcoes() {
		setLayout(new GridLayout(1, 4));
		setBackground(Color.LIGHT_GRAY);
		
		add(new Botao("Realizar Vendas", Color.GREEN, 60, 30));
		add(new Botao("Listar Vendas", Color.GREEN, 60, 30));
		add(new Botao("Mostrar Relatorio", Color.GREEN, 60, 30));
		add(new Botao("Listar Clientes", Color.GREEN, 60, 30));
	}
	
}
