package TRaMis8khae.starbucks.order.entity;

import jakarta.persistence.*;

@Entity
public class OrderDeliveryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDeliveryAddressId;
    @Column(length = 50)
    private String addressDetail;
    @Column(length = 500)
    private String deliveryMemo;
    @Column(length = 50)
    private String deliveryAddressNickname;
    @Column(nullable = false, length = 50)
    private String recipient;
    private String phone1;
    private String phone2;
}