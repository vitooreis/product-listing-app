package view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ProductController;
import model.Product;
import java.awt.Toolkit;


public class ProductList extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTable productTable;
	private JButton addButton;
	private ProductController controller;
	private JButton clearButton;
	
	public ProductList(ProductController controller) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProductList.class.getResource("/img/icons8-cart-26.png")));
		this.controller = controller;
		
		setTitle("Listagem de Produtos");
		setSize(450,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		productTable = new JTable();
		addButton = new JButton("Novo Produto");
		clearButton = new JButton("Limpar Dados");
		
		getContentPane().add(new JScrollPane(productTable), BorderLayout.CENTER);
		
		addButton.addActionListener(e -> new ProductForm(controller, this).setVisible(true));
		
		// Painel para os botoes
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(addButton);
		buttonPanel.add(clearButton); //  Adiciona o botão "Limpar" ao painel
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		
		clearButton.addActionListener(e -> clearData());

		updateList();
	}
	
	public void updateList() {
		List<Product> products = controller.getSortedProducts();
		String[] columnNames = {"Nome", "Valor"};
		String[][] data = new String[products.size()][2];
		
		for (int i = 0; i < products.size(); i++) {
			Product p = products.get(i);
			data[i][0] = p.getName();
			data[i][1] = String.format("%.2f", p.getValue());
		}
		
		productTable.setModel(new DefaultTableModel(data, columnNames));
	}	
		
	private void clearData() {
		controller.clearProducts();
		updateList();
	}		
}
	
