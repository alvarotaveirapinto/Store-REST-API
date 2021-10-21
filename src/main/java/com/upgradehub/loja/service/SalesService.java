package com.upgradehub.loja.service;

import com.upgradehub.loja.model.Sales;
import com.upgradehub.loja.repository.SalesRepository;
import com.upgradehub.loja.request.SalesRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;


    public Sales addSale(SalesRQ sale) {
        Sales newsale = Sales.builder().products(sale.getProductList()).localDate(LocalDate.now()).client(sale.getClient()).build();
        salesRepository.save(newsale);
        return newsale;

//    public String finByClientName(String name) {
//        Optional<Sales> sale = salesRepository.getSalesByClient(name);
//        Long  id = sale.get().getId();
//        if(sale.isEmpty()){
//            return "This client has no sales";
//        }
//        else {
//            return "This client's sales id are:"+id;
//        }
    }
}
