package control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import model.Product;
import repositories.ProductRepository;


@RequestScoped
public class ProductControl {
	private static ProductRepository pdtb = ProductRepository.getInstance();

	

	public static final List<Integer> validIva = new ArrayList<>();
	static {
		validIva.add(6);
		validIva.add(13);
		validIva.add(13);
		}
	
	public static List<Integer> getValidiva() {
		return validIva;
	}

		
	
	public void createProduct(Product p){
		p.setPvp();
		pdtb.createEntity(p);
	}
	
	public void editProduct(Product p){
		p.setPvp();
		pdtb.editEntity(p);
	}
	
	
	public double calculatePvp(Product p) {
		p.setPvp();
		return p.getPvp(); 
	}
	
	

	public Collection<Product> getProducts(){
		return pdtb.getEntity();
				
	}
	
	public void deleteProduct(Product p) {
		pdtb.removeEntity(p);
	}
	
	
}
