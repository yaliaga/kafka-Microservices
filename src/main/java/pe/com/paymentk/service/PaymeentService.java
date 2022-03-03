package pe.com.paymentk.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.com.paymentk.model.dto.PaymeentDto;
import pe.com.paymentk.repository.PaymeentRepository;
import pe.com.paymentk.utils.PaymeentUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class PaymeentService {

  private final PaymeentRepository paymeentRepository;

    public Mono<PaymeentDto> create(final Mono<PaymeentDto> entityToDto) {
        return entityToDto.map(PaymeentUtils::dtoToEntity)
                .flatMap(paymeentRepository::save)
                .map(PaymeentUtils::entityToDto);

    }

    public Flux<PaymeentDto> read() {
       return paymeentRepository.findAll().map(PaymeentUtils::entityToDto);
    }


}
