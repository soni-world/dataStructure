package com.soni.dsQuestions;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

enum Coins {

    HUNDRED(new BigDecimal(Double.toString(100.00))),
    FIFTY(new BigDecimal(Double.toString(50.00))),
    TWENTY(new BigDecimal(Double.toString(20.00))),
    TEN(new BigDecimal(Double.toString(10.00))),
    FIVE(new BigDecimal(Double.toString(5.00))),
    TWO(new BigDecimal(Double.toString(2.00))),
    ONE(new BigDecimal(Double.toString(1.00))),
    HALF_DOLLAR(new BigDecimal(Double.toString(.50))),
    QUARTER(new BigDecimal(Double.toString(.25))),
    DIME(new BigDecimal(Double.toString(.10))),
    NICKEL(new BigDecimal(Double.toString(.05))),
    PENNY(new BigDecimal(Double.toString(.01)));

    BigDecimal value;

    Coins(BigDecimal value) {
        this.value = value;
    }
}


public class CoinExchange {

    public static void getExchange(BigDecimal amount){

        Map<String, Integer> result = getExchangeCalculation(amount);
        for (Map.Entry<String, Integer> entrySet : result.entrySet()) {
            System.out.println(entrySet.getKey() + ":" + entrySet.getValue());
        }


    }

    private static Map<String, Integer> getExchangeCalculation(BigDecimal amount) {
        Map<String, Integer> result = new HashMap<>();
        int coinCount = 0;
        Coins[] avCoins = Coins.values();
        while(amount.compareTo(BigDecimal.ZERO) > 0){
            for(Coins c : avCoins){
                if(amount.compareTo(c.value) >= 0){
                    coinCount = 1;
                    amount = amount.subtract(c.value);
                    if (result.containsKey(c.name())) {
                        coinCount = coinCount + result.get(c.name());
                    }
                    result.put(c.name(), coinCount);
                    break;
                }
            }
        }
        return result;
    }
}
