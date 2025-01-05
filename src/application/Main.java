package application;

import controller.ProductController;
import service.ProductService;
import view.ProductList;

public class Main {

	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		ProductController controller = new ProductController(service);
		ProductList listView = new ProductList(controller);
		listView.setVisible(true);
		
	}

}
