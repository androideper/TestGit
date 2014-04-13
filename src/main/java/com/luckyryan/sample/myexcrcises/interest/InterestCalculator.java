package com.luckyryan.sample.myexcrcises.interest;

import java.security.InvalidParameterException;
import java.util.Date;

/**
 * @author m.abareghi
 *         4/12/14 - 10:54 AM
 */
public interface InterestCalculator {

    /**
     * Calculates interest rate based on number of working days between from and to parameters.
     * None of them must be null or NullPointException is thrown.
     * to parameter must be bigger than from or InvalidParameterException will be thrown.
     *
     * @param from
     * @param to
     * @return
     */
    Double calculate(Date from, Date to) throws InvalidParameterException;
}
