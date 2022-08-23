package com.cydeo;

public class AppleHeavyPreticate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
