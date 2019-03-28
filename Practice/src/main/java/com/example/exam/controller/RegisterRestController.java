package com.example.exam.controller;

import com.example.exam.model.Register;
import com.example.exam.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterRestController {

    private RegisterService registerService;

    @Autowired
    public RegisterRestController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping(value = "/api/register")
    public Object apiRegister(@RequestBody Register register){
        registerService.saveRegister(register);
        return register;
    }
}
