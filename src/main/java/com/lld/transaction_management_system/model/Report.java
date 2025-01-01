package com.lld.transaction_management_system.model;

import com.lld.transaction_management_system.model.transactions.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Report  {
    double closingBalance = 100000.0;
    double expensesIncurred = 0;
    double incomeAccrued = 0;
    double saving = 0.0;
}
