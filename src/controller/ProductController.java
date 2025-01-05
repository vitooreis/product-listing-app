package controller;

import java.util.List;

import model.Product;
import service.ProductService;

public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	public void addProduct(Product product) {
		productService.addProduct(product);
	}
	
	public List<Product> getSortedProducts() {
		return productService.getSortedProducts();
	}	
		
	public void clearProducts() {
		productService.clearProducts();
	}
}
