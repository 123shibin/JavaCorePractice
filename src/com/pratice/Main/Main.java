package com.pratice.Main;


import com.pratice.Abstraction.Inter;
import com.pratice.Abstraction.Test;

class Main{
    public static void main(String[] args){
        Paytm obj= new Paytm();
        Inter inter = new Test();
        obj.Payment();
        inter.add();
    }
}

abstract class OrderProcessor {
    abstract void Payment();
}

class Paytm extends OrderProcessor {

    void Payment(){
        System.out.println("hello");
    }
}


