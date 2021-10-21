package com.upgradehub.loja.request;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewProductRQ {
    private String name;
    private long price;
}
