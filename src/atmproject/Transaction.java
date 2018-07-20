/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;

/**
 *
 * @author prave
 */
public class Transaction {
    private String transaction;
    private int transactionAmount;
    private int remainingAmount;

    public String getTransaction() {
        return transaction;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
    
}
