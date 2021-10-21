package com.upgradehub.loja.controller;

import com.upgradehub.loja.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
    @Autowired
    private SalesService salesService;
}
