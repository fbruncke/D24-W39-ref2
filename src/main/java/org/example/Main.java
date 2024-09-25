package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(10,20,30,40);
        modifyRectangle(rec);

        System.out.printf("Rectangle XY are: %d, %d", rec.x, rec.y);
    }

    private static void modifyRectangle(Rectangle rec) {
        //rec.x = 60;
        //rec.y = 70;
        rec.setLocation(60,70);

    }

}