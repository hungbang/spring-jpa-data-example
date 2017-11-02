package com.smartdev.controller;

import com.smartdev.entity.CustomUser;
import com.smartdev.model.RegisterParam;
import com.smartdev.service.impl.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KAI on 11/2/17.
 */
@Controller
@RequestMapping("/public/v1")
public class RegisterController {


    @Autowired
    private CustomUserDetailsService customUserService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public ModelAndView register(ModelAndView view){
        view.setViewName("register");
        return view;
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity<?> handleRegister(@RequestBody RegisterParam registerParam){
        String username = registerParam.getUserName();
        String password = registerParam.getPassword();
        CustomUser customUser = new CustomUser();
        customUser.setUserName(username);
        customUser.setPassword(passwordEncoder.encode(password));
        customUserService.saveCustomUser(customUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(customUser);
    }

}
