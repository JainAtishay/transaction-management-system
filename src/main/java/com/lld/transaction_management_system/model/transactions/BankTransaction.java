package com.lld.transaction_management_system.model.transactions;

import lombok.Data;

import java.util.Date;

@Data
public class BankTransaction extends Transaction {
    private String type;
    private String category;

    public BankTransaction(){
        super();

    }

    public BankTransaction(double amount, Date date){
        super(amount, date);
    }
}
