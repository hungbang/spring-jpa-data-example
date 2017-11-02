package com.smartdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KAI on 11/2/17.
 */

@Controller
public class LoginController {


    @GetMapping("/error")
    public ModelAndView errorPage(ModelAndView view){

        view.addObject("errorMessage", "404 Not Found");
        view.setViewName("error");
        return view;
    }

}
