package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.ProductController;
import model.Product;


public class ProductForm  extends JFrame {
	
	
	private static final long serialVersionUID = 1L;

    private JTextField nameField;
    private JTextField descriptionField;
    private JTextField valueField;
    private JRadioButton availableYes;
    private JRadioButton availableNo;
    private JButton saveButton;
    private ProductController controller;
    private ProductList listView;

    public ProductForm(ProductController controller, ProductList listView) {
        this.controller = controller;
        this.listView = listView;

        setTitle("Cadastro de Produto");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(4, 2));

        formPanel.add(new JLabel("Nome:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Descrição:"));
        descriptionField = new JTextField();
        formPanel.add(descriptionField);

        formPanel.add(new JLabel("Valor:"));
        valueField = new JTextField();
        formPanel.add(valueField);

        formPanel.add(new JLabel("Disponível:"));
        availableYes = new JRadioButton("Sim");
        availableNo = new JRadioButton("Não");
        ButtonGroup availableGroup = new ButtonGroup();
        availableGroup.add(availableYes);
        availableGroup.add(availableNo);

        JPanel availablePanel = new JPanel();
        availablePanel.add(availableYes);
        availablePanel.add(availableNo);
        formPanel.add(availablePanel);

        add(formPanel, BorderLayout.CENTER);

        saveButton = new JButton("Salvar");
        saveButton.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                saveProduct();
            }
        });
        add(saveButton, BorderLayout.SOUTH);
    }

    private void saveProduct() {
        String name = nameField.getText();
        String description = descriptionField.getText();
        double value = Double.parseDouble(valueField.getText());
        boolean available = availableYes.isSelected();

        // Usa o controller para adicionar o produto
        Product product = new Product(name, description, value, available);
        controller.addProduct(product);

        // Atualiza a lista de produtos na view
        listView.updateList();

        // Fecha o formulário após salvar
        dispose();
    }
}
	
	