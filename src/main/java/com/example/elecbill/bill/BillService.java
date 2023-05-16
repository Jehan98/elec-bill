package com.example.elecbill.bill;

import org.springframework.stereotype.Service;

@Service
public class BillService {
    public String getBill(){
        return "{\"fixed_cost\": \"100\", \"variable_cost\": \"300\"}";
    }
}
