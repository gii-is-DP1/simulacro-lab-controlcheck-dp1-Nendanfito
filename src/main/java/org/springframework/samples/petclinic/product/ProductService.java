package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pr;
	
	@Transactional
    public List<Product> getAllProducts(){
        return pr.findAll();
    }
	@Transactional
    public List<Product> getProductsCheaperThan(double price) {
        return pr.findByPriceLessThan(price);
    }
	@Transactional
    public ProductType getProductType(String name) {
        return pr.getProductType(name);
    }
	@Transactional
    public Product save(Product p){
        return pr.save(p);       
    }

    
}
