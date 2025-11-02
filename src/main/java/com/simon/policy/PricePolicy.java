package com.simon.policy;

import com.simon.rental.Rental;

public interface PricePolicy {

    double getPrice(int days, Rental rental);
    double getEntryFee();
}
