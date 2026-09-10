package com.pratice.Main;


import com.pratice.Abstraction.Inter;
import com.pratice.Abstraction.Test;
import com.pratice.ThisSuperFinal.Bird;

class Main{
    public static void main(String[] args){
        Paytm obj= new Paytm();
        Inter inter = new Test();
        Bird bird = new Bird("Eagle", "Brown", "Forest");
        obj.Payment();
        inter.add();
        bird.display();
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


