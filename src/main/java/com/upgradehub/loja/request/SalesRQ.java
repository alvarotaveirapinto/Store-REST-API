package com.upgradehub.loja.request;

import com.upgradehub.loja.model.Client;
import com.upgradehub.loja.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SalesRQ {
    //
    private List<Product> productList;
    private Client client;
}
