/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class RetireCalc
{
    public static void main( String[] args )
    {
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int currentYear = c.get(Calendar.YEAR);

        System.out.print("What is your current age? ");

        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        int current = Integer.parseInt(firstNum);

        System.out.print("At what age would you like to retire? ");

        String secondNum = input.nextLine();
        int retire = Integer.parseInt(secondNum);

        int diff = retire - current;
        int retireYear = currentYear + diff;

        String output = "It's " + currentYear + ", so you can retire in " + retireYear + ".";

        System.out.println(output);
    }
}