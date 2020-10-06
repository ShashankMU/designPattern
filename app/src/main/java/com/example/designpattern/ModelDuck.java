package com.example.designpattern;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I m model duck");
    }

    public ModelDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }
}
