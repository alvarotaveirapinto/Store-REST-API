package com.upgradehub.loja.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "client")

public class Client {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long Id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "client")
    private List<Sales> sales;

}
