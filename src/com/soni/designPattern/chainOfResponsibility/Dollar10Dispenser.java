package com.soni.designPattern.chainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= 10) {
            int num = curr.getAmount() / 10;
            int remainder = curr.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10 dollar notes");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }else{
            this.chain.dispense(curr);
        }
        }
    }
