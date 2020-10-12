package com.trl.chapter_3;

import javax.ejb.Stateless;

@Stateless
public class AccountService {
    public boolean getLoan(double amount) {
        // check if bank vault has enough
        return true;
    }

    public boolean setCustomerBalance(long id, double amount) {
        // set new customer balance
        return true;
    }
}
