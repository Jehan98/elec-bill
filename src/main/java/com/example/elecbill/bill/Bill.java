package com.example.elecbill.bill;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Bill{
    @Id
    @SequenceGenerator(
        name = "bill_sequence",
        sequenceName = "bill_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "bill_sequence"
    )
    private Long id;
    private double fixed_cost;
    private double variable_cost;

    public Bill( Long id, double fixed_cost, double variable_cost){
        this.fixed_cost = fixed_cost;
        this.variable_cost = variable_cost;
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public double getFixedCost(){
        return fixed_cost;
    }

    public double getVariableCost(){
        return variable_cost;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setFixedCost(double fixed_cost){
        this.fixed_cost = fixed_cost;
    }

    public void setVariableCost(double variable_cost){
        this.variable_cost = variable_cost;
    }

    public String toString(){
        return "Bill{"+
                "id=" + id +
                ", fixed_cost=" + fixed_cost + '\'' +
                ", variable_cost=" + variable_cost + 
                '}';
    }
}