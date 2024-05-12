package com.ptm.demoqlbh.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String phone;

    private String address;

    @Column(name = "created_date")
    private Date createdDate;

    private byte gender;

    private Date birthday;


}
