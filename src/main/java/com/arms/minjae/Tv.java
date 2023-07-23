package com.arms.minjae;

public class Tv {

    String color;
    int channel;
    boolean power;

    public Tv(String color, int channel, boolean power) {
        this.color = color;
        this.channel = channel;
        this.power = power;
    }

    void power() {
        power = !power;
    }

    void channelUp() {
        channel = channel++;
    }

    void channelDown() {
        channel = channel--;
    }
}
