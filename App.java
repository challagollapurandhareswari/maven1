package com.Epam.mavenProject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chocolates c1 = new Chocolates(100,5,"DairyMilk");
        Chocolates c2 = new Chocolates(150,15,"BarOne");
        Chocolates c3 = new Chocolates(5,14,"Munch");
        Chocolates c4 = new Chocolates(2,125,"Perk");
        Sweets s1 = new Sweets(5,4);
        Sweets s2 = new Sweets(70,10);
        Sweets s3 = new Sweets(40,3);
        Sweets s4 = new Sweets(3,20);
        Gifts g = new Gifts();
        System.out.println("Total Weight:"+ g.getWeight());
        System.out.println("Sorting Chocolates based on price: ");
        Chocolates c = new Chocolates();
        c.sortChocolates();
        c.getChocolatesInRange(3, 1);
    }
}
