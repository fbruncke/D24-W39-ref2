package org.example;

import java.awt.*;

public class Student {

    private int money;

    public void setMoney(int money) {
        if( money > 100 ) {
            this.money = money;
        }
    }

    public void talk()
    {

    }

    public void act()
    {
        //beslutningstræ
        buyStuff("Cellphone", 9000);
    }

    public void buyStuff(String item, int price)
    {
        if( price > 200 ) {
            this.money = this.money - price;
        }
    }








}
