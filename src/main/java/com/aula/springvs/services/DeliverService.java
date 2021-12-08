package com.aula.springvs.services;

import org.springframework.stereotype.Service;

@Service
public class DeliverService {
    
    public double fee(String state) {
        if ("SC".equalsIgnoreCase(state)){
            return 10.0;
        }
        return 20.0;
    }
}
