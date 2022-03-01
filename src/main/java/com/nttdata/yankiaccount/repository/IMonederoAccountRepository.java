package com.nttdata.yankiaccount.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.yankiaccount.entity.MonederoAccount;

import reactor.core.publisher.Flux;

public interface IMonederoAccountRepository extends ReactiveMongoRepository<MonederoAccount,String> {
  
  Flux<MonederoAccount> findByNroPhone(String nroPhone);

}
