package com.lld.transaction_management_system.model;

import com.lld.transaction_management_system.model.statements.Statement;
import com.lld.transaction_management_system.model.transactions.StandardTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportGenerator {

    //https://chatgpt.com/c/be000512-bbd4-4b28-86f4-d070197095bb

    private List<StandardTransaction> transactionList;

    @Autowired
    private TransactionManager transactionManager;


    public Report generateReport(Date startDate, Date endDate) {
        List<StandardTransaction> transactions = transactionManager.getTransactionList();

        double closingBalance = 100000.0;
        double expensesIncurred = 0;
        double incomeAccrued = 0;
        double saving = 0.0;

        for(StandardTransaction transaction : transactionList){
            if(transaction.getType().equalsIgnoreCase("debit")){
                expensesIncurred += transaction.getAmount();
            } else{
                incomeAccrued += transaction.getAmount();
            }
        }

        saving = incomeAccrued - expensesIncurred;

        closingBalance += saving;

        return new Report(closingBalance, expensesIncurred, incomeAccrued, saving);

    }
}
