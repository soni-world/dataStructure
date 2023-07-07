package com.soni.designPattern.chainOfResponsibility;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency curr);
    }