package org.springframework.samples.petclinic.product;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="product_type")
public class ProductType extends BaseEntity {
	
	@Column(name="name", unique=true)
	@Size(min=3, max=50)
	private String name;
	
	
	
}
