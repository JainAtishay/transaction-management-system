package com.lld.transaction_management_system.model.statements;

import com.lld.transaction_management_system.model.transactions.BankTransaction;
import com.lld.transaction_management_system.model.transactions.StandardTransaction;
import com.lld.transaction_management_system.model.transactions.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class BankStatement extends Statement {
    private String bank;
    private List<BankTransaction> transactions;

    @Override
    public List<StandardTransaction> convertToStandard() {
        List<StandardTransaction> standardTransactions = new ArrayList<>();
        for(BankTransaction bankTransaction : this.transactions){
            standardTransactions.add(new StandardTransaction(
                    bankTransaction.getAmount(),
                    bankTransaction.getType().equalsIgnoreCase("debit") ? "expense" : "income",
                    bankTransaction.getCategory(),
                    bankTransaction.getDate()));
        }

        return standardTransactions;
    }
}
