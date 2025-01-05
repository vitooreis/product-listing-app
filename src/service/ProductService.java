package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Product;

public class ProductService {
	
	private List <Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product> getSortedProducts() {
		List<Product> sorted = new ArrayList<>(products);
		sorted.sort(Comparator.comparingDouble(Product::getValue));
		return sorted;
	}	
		
	public void clearProducts() {
		products.clear();
	}
}
