package com.upgradehub.loja.model;

import javax.persistence.*;
import java.util.List;

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

    public Client(Long id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}