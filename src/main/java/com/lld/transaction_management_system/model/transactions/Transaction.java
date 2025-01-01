package com.lld.transaction_management_system.model.transactions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Transaction {
    private double amount;
    private Date date;
}
