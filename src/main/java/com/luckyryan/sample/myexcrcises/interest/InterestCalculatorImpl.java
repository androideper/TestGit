package com.luckyryan.sample.myexcrcises.interest;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author m.abareghi
 *         4/12/14 - 11:02 AM
 */
public class InterestCalculatorImpl implements InterestCalculator {
    private static final double STATIC_INTEREST_RATE = 0.01;
    @Override
    public Double calculate(Date from, Date to) throws InvalidParameterException {
        Calendar fromCalendar = Calendar.getInstance();
        fromCalendar.setTime(from);
        Calendar toCalendar = Calendar.getInstance();
        toCalendar.setTime(to);
        if (toCalendar.before(fromCalendar)) {
            throw new InvalidParameterException("\'to\' must be after \'from\'");
        }


        return getNumberOfBusinessDays(fromCalendar, toCalendar) * STATIC_INTEREST_RATE;
    }

    public int getNumberOfBusinessDays(Calendar fromCalendar, Calendar toCalendar){
        int result = 0;
        while(fromCalendar.before(toCalendar)) {
            int weekOfDay = fromCalendar.get(Calendar.DAY_OF_WEEK);
            if (weekOfDay == Calendar.SATURDAY || weekOfDay == Calendar.SUNDAY ){

                // how to check if it is holiday?
                continue;
            }
            result ++;
            fromCalendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        return result;
    }

}
