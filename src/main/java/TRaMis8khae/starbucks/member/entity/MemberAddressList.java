package TRaMis8khae.starbucks.member.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class MemberAddressList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 36)
    private String memberUUID;

    private Boolean addressDefaultCheck;

    @ManyToOne
    private DeliveryAddress deliveryAddress;

    @Builder
    public MemberAddressList(String memberUUID, Boolean addressDefaultCheck, DeliveryAddress deliveryAddress) {
        this.memberUUID = memberUUID;
        this.addressDefaultCheck = addressDefaultCheck;
        this.deliveryAddress = deliveryAddress;
    }
}