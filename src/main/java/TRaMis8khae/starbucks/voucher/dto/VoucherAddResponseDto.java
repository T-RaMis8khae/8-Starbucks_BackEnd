package TRaMis8khae.starbucks.voucher.dto;

import TRaMis8khae.starbucks.voucher.entity.Voucher;
import TRaMis8khae.starbucks.voucher.vo.VoucherAddResponseVo;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class VoucherAddResponseDto {

    @Column(length = 50)
    private String name;

    private Double price;

    private String productUUID;

    private LocalDateTime expireDate;

    private String voucherCode;

    public static VoucherAddResponseDto toDto(Voucher voucher) {
        return VoucherAddResponseDto.builder()
                .name(voucher.getName())
                .price(voucher.getPrice())
                .productUUID(voucher.getProductUUID())
                .expireDate(voucher.getExpireDate())
                .voucherCode(voucher.getVoucherCode())
                .build();
    }

    public VoucherAddResponseVo toVo() {
        return VoucherAddResponseVo.builder()
                .name(this.name)
                .price(this.price)
                .productUUID(this.productUUID)
                .expireDate(this.expireDate)
                .voucherCode(this.voucherCode)
                .build();
    }

}