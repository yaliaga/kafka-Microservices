package pe.com.paymentk.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.paymentk.model.Paymeet;

@Repository
public interface PaymeentRepository extends ReactiveMongoRepository<Paymeet, String> {

}
