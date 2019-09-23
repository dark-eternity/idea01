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
}
