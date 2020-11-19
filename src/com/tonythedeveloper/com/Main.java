package com.tonythedeveloper.com;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        String inputString;
        String customerName;
        double regularWage;
        double basePay;
        double regularHours;
        double overtimeWage;
        double overtimePay = 0;
        double overtimeHours;
        double total;

        customerName = JOptionPane.showInputDialog("Welcome! What is your name?");
        //Get hourly wage
        inputString =
                JOptionPane.showInputDialog("How much do you get paid per hour?");
        basePay= Integer.parseInt(inputString);

        inputString =
                JOptionPane.showInputDialog("How many hours did you work?");
        regularHours = Integer.parseInt(inputString);

        inputString =
                JOptionPane.showInputDialog("How much do you get paid overtime");
        overtimeWage = Double.parseDouble(inputString);

        inputString =
                JOptionPane.showInputDialog("how many overtime hours did you work!");
        overtimeHours = Double.parseDouble(inputString);

        regularWage = basePay * regularHours;
        overtimeWage = overtimePay * overtimeHours;
        total = regularWage;

        JOptionPane.showMessageDialog(null, "Hello " +
                customerName + ". Your gross pay is $" +
                total);
        System.exit(0);

    }
}
