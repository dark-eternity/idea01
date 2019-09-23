package com.dark.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class Commodity {
    private Integer id;
    private String name;
    private Double price;
    private Date birthday;
    private String describes;

    public Commodity() {
    }

    public Commodity(Integer id, String name, Double price, Date birthday, String describes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.birthday = birthday;
        this.describes = describes;
    }
}
