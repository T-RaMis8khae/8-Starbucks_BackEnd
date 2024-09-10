package TRaMis8khae.starbucks.product.dto;

import TRaMis8khae.starbucks.product.entity.Product;
import TRaMis8khae.starbucks.product.vo.ProductResponseVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {

    private String productName;
    private String productUUID;
    private Double price;
    private Long optionId;
    private Boolean soldOutChecked;
    private Boolean closedChecked;
    private Boolean openChecked;
    private Boolean thumbChecked;
    private String path;

    public ProductResponseVo toVo() {
        return ProductResponseVo.builder()
            .productName(productName)
            .productUUID(productUUID)
            .price(price)
            .optionId(optionId)
            .soldOutChecked(soldOutChecked)
            .closedChecked(closedChecked)
            .thumbChecked(thumbChecked)
            .path(path)
            .build();
    }

}