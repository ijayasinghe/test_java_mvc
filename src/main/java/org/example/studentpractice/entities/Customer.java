package org.example.studentpractice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id //member field below is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to set a auto incrementing field in tables im DB
    private Long id;
    private String customerName;

    private Double customerDeposite;
    private int noOfYears;
    private String savingsType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getCustomerDeposite() {
        return customerDeposite;
    }

    public void setCustomerDeposite(Double customerDeposite) {
        this.customerDeposite = customerDeposite;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    public String getSavingsType() {
        return savingsType;
    }

    public void setSavingsType(String savingsType) {
        this.savingsType = savingsType;
    }
}
