package com.example.demo.models;

public class Ticket {
    private double price;
    private int seat;
    private Boolean isBought;

    public Ticket(double price, int seat, Boolean isBought) {
        this.setPrice(price);
        this.setPrice(price);
        this.setBought(isBought);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Boolean getBought() {
        return isBought;
    }

    public void setBought(Boolean bought) {
        isBought = bought;
    }
}
