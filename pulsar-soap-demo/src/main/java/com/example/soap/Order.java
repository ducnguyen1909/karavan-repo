package com.example.soap;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "order")
public class Order {
    private String id;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
