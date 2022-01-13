package org.springframework.samples.petclinic.product;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(path = "/create")
	public String processCreationForm(@Valid Product product, BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			modelMap.addAttribute("product",product);
			return "products/createOrUpdateProductForm";
		}
		else {
			productService.save(product);
			modelMap.addAttribute("message","Producto agregado correctamente");
			return "welcome";
		}
	}
	
	
	
	
    
}
