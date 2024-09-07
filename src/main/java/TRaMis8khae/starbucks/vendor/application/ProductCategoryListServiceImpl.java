package TRaMis8khae.starbucks.vendor.application;

import TRaMis8khae.starbucks.product.infrastructure.ProductRepository;
import TRaMis8khae.starbucks.vendor.dto.ProductCategoryListRequestDto;
import TRaMis8khae.starbucks.vendor.dto.ProductCategoryListResponseDto;
import TRaMis8khae.starbucks.vendor.infrastructure.ProductCategoryListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductCategoryListServiceImpl implements ProductCategoryListService{

    private final ProductRepository productRepository;
    private final ProductCategoryListRepository productCategoryListRepository;

    @Override
    public void addProductByCategory(ProductCategoryListRequestDto productCategoryListRequestDto) {
        productCategoryListRepository.save(productCategoryListRequestDto.toEntity(
                productRepository.findById(productCategoryListRequestDto.getProductId()).orElseThrow(
                        () -> new IllegalArgumentException("해당 상품이 존재하지 않습니다."))
                )
        );
    }

    @Override
    public List<ProductCategoryListResponseDto> findProductsByCategory(Integer mainId, Integer subId) {
        return List.of();
    }

}