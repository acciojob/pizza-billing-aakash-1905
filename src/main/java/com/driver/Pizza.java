package com.driver;

public class Pizza {

    private int price;
    private int cheese;
    private int toppings;
    private int bag;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.bill = "";
        this.bag=0;
        this.toppings =0;
        this.cheese = 0;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheese += 80;
    }

    public void addExtraToppings(){
        // your code goes here
        toppings += isVeg? 70 : 120;
    }

    public void addTakeaway(){
        // your code goes here
        bag += 20;
    }

    public String getBill(){
        // your code goes here
        bill += "Base Price Of The Pizza: "+price;
        if(cheese!=0){
            bill += "\nExtra Cheese Added: "+cheese;
        }
        if(toppings!=0){
            bill += "\nExtra Toppings Added: "+toppings;
        }
        if(bag!=0){
            bill += "\nPaperbag Added: "+bag;
        }
        int tp = bag + cheese + toppings +  price;
        bill += "\nTotal Price: "+tp;
        return this.bill;
    }
}
