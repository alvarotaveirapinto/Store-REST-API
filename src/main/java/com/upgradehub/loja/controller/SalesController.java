package com.upgradehub.loja.controller;

import com.upgradehub.loja.model.Sales;
import com.upgradehub.loja.request.SalesRQ;
import com.upgradehub.loja.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loja")
public class SalesController {
    @Autowired
    private SalesService salesService;

//    @GetMapping("/sales-client/{name}")
//    public String getSaleByClientName(String name) {
//        return salesService.finByClientName(name);
//    }

    @PostMapping("/sales")
    public Sales addSale(@RequestBody SalesRQ sale) {
        return salesService.addSale(sale);
    }
}
