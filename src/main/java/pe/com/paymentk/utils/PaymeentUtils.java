package pe.com.paymentk.utils;


import org.springframework.beans.BeanUtils;

import pe.com.paymentk.model.Paymeet;
import pe.com.paymentk.model.dto.PaymeentDto;

public final class PaymeentUtils {
    private PaymeentUtils() {
    }

    public static PaymeentDto entityToDto(final Paymeet paymeent) {
        var paymeentDto = new PaymeentDto();
        BeanUtils.copyProperties(paymeent, paymeentDto);
        return paymeentDto;
    }
    public static Paymeet dtoToEntity(final PaymeentDto paymeentDto) {
        var entity = new Paymeet();
        BeanUtils.copyProperties(paymeentDto, entity);
        return entity;
    }


}
