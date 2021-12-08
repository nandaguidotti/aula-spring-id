package com.aula.springvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.springvs.services.PayService;


 @RestController
 public class springvs {

    @Autowired
	private PayService payService;   
    
    @GetMapping(value="/")
    public String getMethodName() {
        return ("Aula: Spring (Java): Introdução ao Spring Boot e Spring Core (injeção de dependências)"); 
    }

    @GetMapping(value="/taxa")
    public String getMethodTaxa() {
        return ("VALOR TOTAL =  " + payService.finalPrice(300.0, "SC")); 
    }
    

}
