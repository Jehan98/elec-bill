package com.example.elecbill.bill;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/bill")
public class BillController {

    private BillService billService;

    public BillController(BillService billService){
        this.billService = billService;
    }

    @GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public String getBill(@RequestParam("value") int requestData){
		return billService.getBill();
	}

}
