package TRaMis8khae.starbucks.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class OrderDeliveryAddressList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public OrderDeliveryAddressList(String addressDetail, String deliveryMemo, String deliveryAddressNickname, String recipient, String phone1, String phone2) {
        this.addressDetail = addressDetail;
        this.deliveryMemo = deliveryMemo;
        this.deliveryAddressNickname = deliveryAddressNickname;
        this.recipient = recipient;
        this.phone1 = phone1;
        this.phone2 = phone2;
    }
}
