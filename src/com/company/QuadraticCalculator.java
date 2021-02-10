package com.company;

import java.util.Scanner;

public class QuadraticCalculator {

    double delta = 0;

    public void calculateEquation() {

        Scanner squareCoefficient = new Scanner(System.in);
        System.out.println("Enter the coefficient of x²: ");
        int a = squareCoefficient.nextInt();
        System.out.println(a);

        Scanner xCoefficient = new Scanner(System.in);
        System.out.println("Enter the coefficient of x: ");
        int b = xCoefficient.nextInt();

        Scanner constant = new Scanner(System.in);
        System.out.println("Enter the constant of equation: ");
        int c = constant.nextInt();

        System.out.println("The equation you have entered is: ");
        displayEquation(a,b,c);
        discriminant(a,b,c);
        roots(a,b);

    }

    public void displayEquation(int a, int b, int c){
        System.out.println(a + "x²" + " + " + b + "x" + " + " + c);
    }

    public void discriminant(int a, int b, int c){
        delta = ((Math.pow(b,2)) - (4*a*c));
        System.out.println("Discriminant of the equation is " + delta);
    }

    public void roots(int a, int b){
        double firstRoot = ((-b + (Math.pow(delta,0.5)))/(2*a));
        double secondRoot = ((-b - (Math.pow(delta,0.5)))/(2*a));
        if(delta < 0){
            System.out.println("The equation you hav entered has no real roots, since discriminant of the equation equals to " + delta);
        }else if(delta == 0){
            System.out.println("The equation has two equal roots respectively " + firstRoot + " and " + secondRoot);
        }else if(delta > 0){
            System.out.println("The equation has two real roots respectively " + firstRoot + " and " + secondRoot);
        }
    }
}
