package com.supertiles.ecommerce.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    // Customer ke ID ko store karne ke liye
    public Long customerId;

    public String name;
    public String phone;
    public String line1;
    public String line2;
    public String city;
    public String state;
    public String postalCode;
    public String country;

    public boolean defaultAddress;
}
