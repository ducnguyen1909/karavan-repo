package com.example.soapmodel;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}

    public Order createOrder() {
        return new Order();
    }
}
