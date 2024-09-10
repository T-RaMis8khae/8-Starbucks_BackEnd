package TRaMis8khae.starbucks.product.entity;


import TRaMis8khae.starbucks.common.entity.Media;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductMedia extends Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String productUUID;

}
