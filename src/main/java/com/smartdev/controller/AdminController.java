package com.smartdev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KAI on 10/31/17.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/users")
    public ResponseEntity<?> viewUserAdmin(){
        return ResponseEntity.ok("admin");
    }
}
