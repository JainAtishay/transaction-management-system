package com.lld.transaction_management_system.model.transactions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class StandardTransaction {
    private double amount;
    private String type;
    private String category;
    private Date date;
}
