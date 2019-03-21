package com.greenfoxacademy.foxclub.repository;

import com.greenfoxacademy.foxclub.model.FoxAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxAccountRepository extends CrudRepository<FoxAccount,Long> {

    FoxAccount findByName(String name);
}
