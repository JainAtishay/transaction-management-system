package com.lld.transaction_management_system.model;

import com.lld.transaction_management_system.model.statements.Statement;

public interface ITransactionService {

    void addStatementTransactions(Statement statement);
}
