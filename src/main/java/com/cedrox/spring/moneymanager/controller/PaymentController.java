package com.cedrox.spring.moneymanager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController  {
    @RequestMapping(method=RequestMethod.GET,value="/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("carajo");
    	return "holaaa";
        
    }
}
