import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TelaDeInformacao extends JPanel{
	
	JPanel realizarvendas;
	JPanel listarvendas;
	JPanel mostrarrelatorio;
	JPanel listarclientes;
	
	public TelaDeInformacao() {
		setBackground(Color.LIGHT_GRAY);
		realizarvendas = organizarRealizarVendas();
		add(realizarvendas, BorderLayout.CENTER);
		listarvendas = organizarListarVendas();
		add(listarvendas, BorderLayout.CENTER);
	}
	
	public JPanel organizarRealizarVendas() {
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(7, 2));
		panel.add(new Texto("Nome Cliente:"));
		panel.add(new EntradaDeTexto());
		
		panel.add(new Texto("Matricula:"));
		panel.add(new EntradaDeTexto());
		
		panel.add(new Texto("Opção de Queijo:"));
		String[] queijos = { "Parmesao", "qualho", "prado", "mussarela" };
		JComboBox opQueijos = new JComboBox(queijos);
		panel.add(opQueijos);
		
		panel.add(new Texto("Opção de Proteína:"));
		panel.add(new EntradaDeTexto());
		
		panel.add(new Texto("Ingredientes:"));
		panel.add(new EntradaDeTexto());
		
		panel.add(new Texto("Bebida:"));
		panel.add(new EntradaDeTexto());
		
		JPanel pa = new JPanel();
		pa.setBackground(Color.LIGHT_GRAY);
		panel.add(pa);
		panel.add(new Botao("Realizar Venda", Color.GREEN, 20, 20), BorderLayout.CENTER);
		
		return panel;
	}
	
	public JPanel organizarListarVendas() {
		
		JPanel panel = new JPanel();
		
		String [] colunas = { "Nome", "Número"};
		
		Object [][] dados = { { "Marcos", "01" }, { "Rodrigo", "02" }};
		
		JTable tabela = new JTable(dados, colunas);
		panel.add(tabela);
		
		return panel;
	}
}
