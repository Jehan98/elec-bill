package com.example.elecbill.bill;

import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository){
        this.billRepository = billRepository;
    }

    public String getBill(Integer units){
        Integer fixed_cost = billRepository.elecBillFixedCost(units);
        Integer variable_cost = billRepository.elecBillVariableCost(units);
        return String.format("{\"fixed_cost\": \"%d\", \"variable_cost\": \"%d\"}", fixed_cost, variable_cost);
        
    }
}
