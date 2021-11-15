package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum) {
        amount = amount + sum;
    }
    public double withDraw( int sum)  throws LimitException {
        if (sum > amount) {
            throw new LimitException("снимаем общий счет", getAmount());
        }
        amount -= sum;
        System.out.println("счет снятье" + sum);
        return amount;


    }

}
