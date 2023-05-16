package com.example.elecbill.bill;

public class Bill{
    private double fixed_cost;
    private double variable_cost;

    public Bill(double fixed_cost, double variable_cost){
        this.fixed_cost = fixed_cost;
        this.variable_cost = variable_cost;
    }

    public double getFixedCost(){
        return fixed_cost;
    }

    public double getVariableCost(){
        return variable_cost;
    }

    public void setFixedCost(double fixed_cost){
        this.fixed_cost = fixed_cost;
    }

    public void setVariableCost(double variable_cost){
        this.variable_cost = variable_cost;
    }
}