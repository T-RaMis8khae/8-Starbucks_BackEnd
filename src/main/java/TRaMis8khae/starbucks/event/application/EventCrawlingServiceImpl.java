package TRaMis8khae.starbucks.event.application;

import TRaMis8khae.starbucks.event.dto.in.EventRequestDto;
import TRaMis8khae.starbucks.event.dto.in.ProductEventListRequestDto;
import TRaMis8khae.starbucks.event.entity.Event;
import TRaMis8khae.starbucks.event.entity.ProductEventList;
import TRaMis8khae.starbucks.event.infrastructure.EventMediaRepository;
import TRaMis8khae.starbucks.event.infrastructure.EventRepository;
import TRaMis8khae.starbucks.event.infrastructure.ProductEventListRepository;
import TRaMis8khae.starbucks.product.entity.Product;
import TRaMis8khae.starbucks.product.infrastructure.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventCrawlingServiceImpl implements EventCrawlingService {

    private final EventRepository eventRepository;
    private final ProductRepository productRepository;
    private final EventMediaRepository eventMediaRepository;
    private final ProductEventListRepository productEventListRepository;

    @Override
    public void addCrawlEvent(EventRequestDto requestDto) {

        Event event = requestDto.toEntity(requestDto);

        eventRepository.save(event);

    }

    @Override
    public void addCrawlEventProduct(ProductEventListRequestDto requestDto) {

        Product product = productRepository.findByProductUUID(requestDto.getProduct().getProductUUID())
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 존재하지 않습니다."));

        ProductEventList productEventList = requestDto
                .toEntity(requestDto.getEvent(), product);

        productEventListRepository.save(productEventList);

    }

}