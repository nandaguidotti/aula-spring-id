package com.aula.springvs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    
    @Autowired
    private TaxService taxService;

    @Autowired
    private DeliverService deliverService;

//    public PayService(TaxService taxService, DeliverService deliverService) {
//        this.taxService = taxService;
//        this.deliverService = deliverService;
//    }

    public double finalPrice(double cost, String state) {
        return cost + deliverService.fee(state) + taxService.tax(cost);
    }
}
