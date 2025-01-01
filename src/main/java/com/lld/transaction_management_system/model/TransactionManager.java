package com.lld.transaction_management_system.model;

import com.lld.transaction_management_system.model.statements.Statement;
import com.lld.transaction_management_system.model.transactions.StandardTransaction;
import com.lld.transaction_management_system.model.transactions.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionManager{

    private List<StandardTransaction> transactionList;


    public void addStatement(Statement statement) {
        transactionList.addAll(statement.convertToStandard());
    }

    public List<StandardTransaction> getTransactionList() {
        return this.transactionList;
    }
}
