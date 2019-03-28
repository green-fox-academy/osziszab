package com.example.exam.service;

import com.example.exam.model.Register;
import com.example.exam.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterService {

    private RegisterRepository registerRepository;
    private String message;
    private int cuponLimit;
    private Register tempReg;

    @Autowired
    public RegisterService(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
        this.cuponLimit = 0;
    }

    public void saveRegister(Register register) {
        if (registerRepository.existsByEmail(register.getEmail())) {
            tempReg=register;
            message = "email is already in use";
        } else if (!register.getCouponcode().equals("FIRST100") && !register.getCouponcode().equals("")) {
            tempReg=register;
            message = "invalid coupon code";
        } else if (!register.getPassword().matches("^[a-zA-Z]+$")) { //(!isLatin(register.getPassword()))
            tempReg=register;
            message = "password must only contain letters from the Latin-alphabet";
        } else if (register.getCouponcode().equals("FIRST100") && cuponLimit < 100) {
            cuponLimit++;
            register.setBalance(1000);
            register.setPassword(encryptPassword(register.getPassword()));
            registerRepository.save(register);
            setTempReg(new Register());
            message = "Successful registration!";

        } else {
            register.setPassword(encryptPassword(register.getPassword()));
            registerRepository.save(register);
            setTempReg(new Register());
            message = "Successful registration!";

        }
    }

    public boolean isLatin(String password) {
        boolean latin = false;
        for (char pw : password.toCharArray()) {
            int value = (int) pw;

            if ((value >= 65 && value <= 90 || (value >= 97 && value <= 122))) {
                latin = true;
            }
        }
        return latin;
    }

    public String encryptPassword(String password) {
        String result = "";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            result += c;
        }
        return result;
    }

    public List<String> showLastUserName() {
        List<String> lastFive = new ArrayList<>();
        lastFive = registerRepository.lastemails();
        List<String> result = new ArrayList<>();
        for (String name : lastFive) {
            String[] justName = name.split("@");
            String emailName = justName[0];
            result.add(emailName);
        }
        return result;
    }

    public List<String> usernameMaker() {
        List<String> usernames = new ArrayList<>();
        registerRepository.findTop5ByOrderByIdDesc().stream()
                .forEach(r -> {
                    String[] emailSplit = r.getEmail().split("@");
                    usernames.add(emailSplit[0]);
                });
        return usernames;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Register getTempReg() {
        return tempReg;
    }

    public void setTempReg(Register tempReg) {
        this.tempReg = tempReg;
    }

}
