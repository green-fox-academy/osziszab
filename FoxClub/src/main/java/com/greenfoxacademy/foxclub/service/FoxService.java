package com.greenfoxacademy.foxclub.service;

import com.greenfoxacademy.foxclub.model.Fox;
import com.greenfoxacademy.foxclub.model.FoxAccount;
import com.greenfoxacademy.foxclub.repository.FoxAccountRepository;
import com.greenfoxacademy.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {

    private FoxRepository foxRepository;
    private FoxAccountRepository foxAccountRepository;

    @Autowired
    public FoxService(FoxRepository foxRepository, FoxAccountRepository foxAccountRepository) {
        this.foxRepository = foxRepository;
        this.foxAccountRepository = foxAccountRepository;
    }

    public void saveFox(Fox fox, long id){
        fox.setFoxAccount(foxAccountRepository.findById(id).get());
        foxRepository.save(fox);
    }

    public List<Fox> showAllfoxes(){
        Iterable<Fox> source = this.foxRepository.findAll();
        List<Fox> target = new ArrayList<>();
        source.forEach(target::add);
        return target;
    }
    public Fox findbíId(long id){
        return foxRepository.findById(id);
    }
}
