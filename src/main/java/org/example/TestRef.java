package org.example;

import java.awt.*;

public class TestRef {

    public static void main(String[] args) {
        //arrange
        Rectangle rec = new Rectangle(10,20,30,40);
        //act
        modifyRectangle(rec);
        //assert
        System.out.printf("%n Rectangle x,y: %d,%d",rec.x, rec.y);
    }

    /**
     * edit rec
     * @param pRec
     */
    public static void modifyRectangle(Rectangle pRec){
        //rec.setLocation(60,70);
        pRec = new Rectangle(60,70,80,90);


        System.out.printf("%n New Rectangle x,y: %d,%d",pRec.x, pRec.y);
    }
}
