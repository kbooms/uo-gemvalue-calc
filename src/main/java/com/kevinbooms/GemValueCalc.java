package com.kevinbooms;

import java.util.*;

import static java.lang.Integer.parseInt;

    /*
    * So far this program is very rudimentary. It runs once, asks the user to input the number of gems
    * in their bags, and the program will calculate the individual and total gold value of each and all
    * gems they possess.
    *
    * Future changes will be to convert a lot of the functions into methods, implement a constructor
    * so a calculator object can be called to run the functions, for the time being the program does
    * what I need it to do.
    */

public class GemValueCalc {

    public static void main(String[] args) {

        // these can be converted into class properties, perhaps I should use a Map
        int citrine = 0;
        int tourmaline = 0;
        int amber = 0;
        int amethyst = 0;
        int ruby = 0;
        int sapphire = 0;
        int emerald = 0;
        int starSapphire =  0;
        int diamond = 0;

        // values for a calculator class
        final int CITRINE_VALUE = 20;
        final int TOURMALINE_VALUE = 30;
        final int AMBER_VALUE = 40;
        final int AMETHYST_VALUE = 50;
        final int RUBY_VALUE = 60;
        final int SAPPHIRE_VALUE = 70;
        final int EMERALD_VALUE = 80;
        final int STAR_SAPPHIRE_VALUE = 90;
        final int DIAMOND_VALUE = 100;

        System.out.println("This simple calculator will add the total amount of gems you enter (representing your current bag) " +
                "and calculate the vendor gold value of the gems you've entered. \n");

        // method to take in user input
        System.out.println("Please enter the amount of gems: ");
        Scanner gemCount = new Scanner(System.in);
        System.out.print("Citrines? ");
        citrine = parseInt(gemCount.next()); // 244
        System.out.print("Tourmalines? ");
        tourmaline = parseInt(gemCount.next()); // 184
        System.out.print("Ambers? ");
        amber = parseInt(gemCount.next()); // 193
        System.out.print("Amethysts? ");
        amethyst = parseInt(gemCount.next()); // 202
        System.out.print("Rubies? ");
        ruby = parseInt(gemCount.next()); // 128
        System.out.print("Sapphires? ");
        sapphire = parseInt(gemCount.next()); // 134
        System.out.print("Emeralds? ");
        emerald = parseInt(gemCount.next()); // 48
        System.out.print("Star Sapphires? ");
        starSapphire = parseInt(gemCount.next()); // 64
        System.out.print("Diamonds? ");
        diamond = parseInt(gemCount.next()); // 50

        // method tp calculate total gem value
        int totalValue = ((CITRINE_VALUE * citrine) +
                (TOURMALINE_VALUE * tourmaline) +
                (AMBER_VALUE * amber) +
                (AMETHYST_VALUE * amethyst) +
                (RUBY_VALUE * ruby) +
                (SAPPHIRE_VALUE * sapphire) +
                (EMERALD_VALUE * emerald) +
                (STAR_SAPPHIRE_VALUE * starSapphire) +
                (DIAMOND_VALUE * diamond));


        // method to diplay final output and print user input and total value
        System.out.println("Citrines:       " + citrine + " @ " + CITRINE_VALUE + " gp = " + (CITRINE_VALUE * citrine) + "gp");
        System.out.println("Tourmalines:    " + tourmaline + " @ " + TOURMALINE_VALUE + " gp = " + (TOURMALINE_VALUE * tourmaline) + "gp");
        System.out.println("Amber:          " + amber + " @ " + AMBER_VALUE + " gp = " + (AMBER_VALUE * amber) + "gp");
        System.out.println("Amethysts:      " + amethyst + " @ " + AMETHYST_VALUE + " gp = " + (AMETHYST_VALUE * amethyst) + "gp");
        System.out.println("Rubies:         " + ruby + " @ " + RUBY_VALUE + " gp = " + (RUBY_VALUE * ruby) + "gp");
        System.out.println("Sapphires:      " + sapphire + " @ " + SAPPHIRE_VALUE + " gp = " + (SAPPHIRE_VALUE * sapphire) + "gp");
        System.out.println("Emeralds:       " + emerald + " @ " + EMERALD_VALUE + " gp = " + (EMERALD_VALUE * emerald) + "gp");
        System.out.println("Star Sapphires: " + starSapphire + " @ " + STAR_SAPPHIRE_VALUE + " gp = " + (STAR_SAPPHIRE_VALUE * starSapphire) + "gp");
        System.out.println("Diamonds:       " + diamond +  " @ " + DIAMOND_VALUE + " gp = " + (DIAMOND_VALUE * diamond) + "gp" + "\n");

        System.out.println("Total Gold Value: " + totalValue);
    }


}

