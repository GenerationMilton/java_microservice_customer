package com.market.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="customers")
public class Cliente {

    @Id
    private String user;
    private String password;
    private String name;
    private String address;
    private String email;


}
