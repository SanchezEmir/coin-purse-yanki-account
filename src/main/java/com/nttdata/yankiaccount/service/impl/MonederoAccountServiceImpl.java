package com.nttdata.yankiaccount.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.yankiaccount.entity.MonederoAccount;
import com.nttdata.yankiaccount.repository.IMonederoAccountRepository;
import com.nttdata.yankiaccount.service.IMonederoAccountService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class MonederoAccountServiceImpl implements IMonederoAccountService {

  @Autowired
  IMonederoAccountRepository dao;

  @Override
  public Mono<MonederoAccount> create(MonederoAccount m) {
    log.info("Agregando cuenta");
    return dao.save(m);
  }

  @Override
  public Flux<MonederoAccount> findAll() {
    log.info("Listar cuentas");
    return dao.findAll();
  }

  @Override
  public Mono<MonederoAccount> findById(String id) {
    log.info("Buscar cuenta por Id");
    return dao.findById(id);
  }

  @Override
  public Flux<MonederoAccount> findByNroPhone(String nroPhone) {
    log.info("Buscar cuenta por numero de celular");
    return dao.findByNroPhone(nroPhone);
  }

  @Override
  public Mono<MonederoAccount> update(MonederoAccount m) {
    return dao.save(m);
  }

  @Override
  public Mono<Boolean> delete(String id) {
    return dao.findById(id)
        .flatMap(money -> dao.delete(money).then(Mono.just(Boolean.TRUE)))
        .defaultIfEmpty(Boolean.FALSE);
  }

}
