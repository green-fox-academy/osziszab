package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.FoxAccount;
import com.greenfoxacademy.foxclub.repository.FoxAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxAccountService {

    private FoxAccountRepository foxAccountRepository;

    @Autowired
    public FoxAccountService(FoxAccountRepository foxAccountRepository) {
        this.foxAccountRepository = foxAccountRepository;
    }

    public void saveAccount(FoxAccount foxAccount) {
        foxAccountRepository.save(foxAccount);
    }

    public Long getTheAccount(String name, String password) {
        FoxAccount account = foxAccountRepository.findByName(name);

        if (account != null && account.getName().equals(name) && account.getPassword().equals(password)) {
            return account.getId();
        } else {
            return null;
        }
    }
}
