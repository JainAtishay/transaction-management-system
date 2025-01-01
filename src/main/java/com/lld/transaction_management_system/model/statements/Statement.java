package com.lld.transaction_management_system.model.statements;

import com.lld.transaction_management_system.model.transactions.StandardTransaction;

import java.util.List;

public abstract class Statement {
    public abstract List<StandardTransaction> convertToStandard();
}
