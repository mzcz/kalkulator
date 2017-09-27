package com.kalkulator;

public class Calculator {

 private int x, y;

 public Calculator(final int x, final int y){
     this.x = x;
     this.y = y;
 }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int addElement(){
     return x + y;
    }

    public int minusElement(){
        return x - y;
    }

    public static void main(String args[]) {

        Calculator calculator = new Calculator(6,4);

        int sumOFEelemets = calculator.addElement();
        System.out.println("Sum elements " + calculator.getX() + " + " +  calculator.getY() + " = " + sumOFEelemets);

        int differenceOfElements = calculator.minusElement();
        System.out.println("Difference elements " + calculator.getX() + " - " +  calculator.getY() + " = " + differenceOfElements);
    }
}


