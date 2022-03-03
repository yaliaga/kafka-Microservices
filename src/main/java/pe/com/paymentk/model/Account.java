package pe.com.paymentk.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class Account implements Serializable {
    private String id;
    private String number;
    private double availableBalance;

}
