package com.soni;

public class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int data){
        this.data = data;
        left = null;
        right = null;
    }

    Tree(int data, Tree left, Tree right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
