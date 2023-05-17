package com.example.elecbill.bill;

import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository){
        this.billRepository = billRepository;
    }

    public String getBill(){
        int fixed_cost = billRepository.testVariableAboveValue(5);
        int variable_cost = billRepository.testVariableAboveValue(15);
        return String.format("{\"fixed_cost\": \"%d\", \"variable_cost\": \"%d\"}", fixed_cost, variable_cost);
        
    }
}
