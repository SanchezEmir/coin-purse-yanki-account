package com.nttdata.yankiaccount.service;

import com.nttdata.yankiaccount.entity.MonederoAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMonederoAccountService {

  Mono<MonederoAccount> create(MonederoAccount m);

  Flux<MonederoAccount> findAll();

  Mono<MonederoAccount> findById(String id);

  Flux<MonederoAccount> findByNroPhone(String nroPhone);

  Mono<MonederoAccount> update(MonederoAccount m);

  Mono<Boolean> delete(String id);

}
