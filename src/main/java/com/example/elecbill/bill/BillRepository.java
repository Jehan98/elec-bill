package com.example.elecbill.bill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{
    @Procedure(name = "testVariableAboveValue")
    Integer testVariableAboveValue(Integer inputValue);
}
