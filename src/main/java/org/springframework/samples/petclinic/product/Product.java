package org.springframework.samples.petclinic.product;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.PositiveOrZero;
import org.springframework.samples.petclinic.model.NamedEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="product")
public class Product extends NamedEntity{
	
	@Column(name="price")
    @PositiveOrZero
    private double price;
    
	@ManyToOne
	@JoinColumn(name="product_type_id")
    private ProductType productType;
	
}
