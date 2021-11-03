/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiwanka
 */
public class prac {

    public static void main(String[] args) {
        String data1[] = {"9", "3", "1", "7"};
        String data2[] = {"Nine", "One", "Four"};

        Expression txt = new Text("");
        Expression num = new Text("");
        for (String d1 : data1) {
            txt = new Num2Text(new Text(d1));
            System.out.print(" " + txt.interpret());
        }
        System.out.println("");
        System.out.println("");
        for (String d2 : data2) {
            num = new Text2Num(new Text(d2));
            System.out.print(" " + num.interpret());
        }
        System.out.println("");
    }
}

interface Expression {

    public String interpret();
}

class Text implements Expression {

    String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String interpret() {
        return text;
    }
}

class Num2Text implements Expression {

    Expression e1;

    public Num2Text(Expression e1) {
        this.e1 = e1;
    }

    @Override
    public String interpret() {

        String val = "";
        if (e1.interpret().equals("0")) {
            val = "Zero";
        } else if (e1.interpret().equals("1")) {
            val = "One";
        } else if (e1.interpret().equals("2")) {
            val = "Two";
        } else if (e1.interpret().equals("3")) {
            val = "Three";
        } else if (e1.interpret().equals("4")) {
            val = "Four";
        } else if (e1.interpret().equals("5")) {
            val = "Five";
        } else if (e1.interpret().equals("6")) {
            val = "Six";
        } else if (e1.interpret().equals("7")) {
            val = "Seven";
        } else if (e1.interpret().equals("8")) {
            val = "Eight";
        } else if (e1.interpret().equals("9")) {
            val = "Nine";
        }
        return val;
    }
}

class Text2Num implements Expression {

    Expression e1;

    public Text2Num(Expression e1) {
        this.e1 = e1;
    }

    @Override
    public String interpret() {

        String val = "";
        if (e1.interpret().equals("Zero")) {
            val = "0";
        } else if (e1.interpret().equals("One")) {
            val = "1";
        } else if (e1.interpret().equals("Two")) {
            val = "2";
        } else if (e1.interpret().equals("Three")) {
            val = "3";
        } else if (e1.interpret().equals("Four")) {
            val = "4";
        } else if (e1.interpret().equals("Five")) {
            val = "5";
        } else if (e1.interpret().equals("Six")) {
            val = "6";
        } else if (e1.interpret().equals("Seven")) {
            val = "7";
        } else if (e1.interpret().equals("Eight")) {
            val = "8";
        } else if (e1.interpret().equals("Nine")) {
            val = "9";
        }
        return val;
    }
}