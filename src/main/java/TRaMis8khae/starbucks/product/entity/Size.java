package TRaMis8khae.starbucks.product.entity;

import jakarta.persistence.*;

@Entity
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sizeId;
    @Column(nullable = false, length = 50)
    private String name;
}