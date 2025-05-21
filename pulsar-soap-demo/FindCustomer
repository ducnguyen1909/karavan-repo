package com.example.soap;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "findCustomer", namespace = "http://example.com")
public class FindCustomer {
    private int id;

    @XmlElement(namespace = "http://example.com")
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
