package com.soni.designPattern.chainOfResponsibility;
// https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java

public class ATMDispenseChain {

    public DispenseChain c1;

    public ATMDispenseChain(){
        this.c1 = new Dollar20Dispenser();
        DispenseChain c2 = new Dollar10Dispenser();
        c1.setNextChain(c2);
    }
}
