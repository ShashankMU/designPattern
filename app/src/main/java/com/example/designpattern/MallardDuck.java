package com.example.designpattern;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I m real Mallard Duck");
    }

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
