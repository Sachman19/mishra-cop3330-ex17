/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Sachin Mishra
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (in lbs). ");
        double weight = input.nextDouble();

        System.out.print("Enter 0 if you are male. Enter 1 if female. ");
        int sex = input.nextInt();

        double ratio;
        if(sex == 0){
        ratio = 0.73;
        }
        else if(sex == 1){
        ratio = 0.66;
        }
        else{
            ratio = 0.73;
            System.out.println("Error: invalid input. Defaulting to 0.");
        }

        System.out.print("Enter your how much alcohol you've consumed (in oz). ");
        double alcohol = input.nextDouble();

        System.out.print("Enter the number of hours since your last drink. ");
        int time = input.nextInt();

        //BAC = (A × 5.14 / W × r) − .015 × H
        double bac = (alcohol * 5.14 / weight * ratio) - 0.015 * time;
        System.out.printf("Your BAC is %.2f%n", bac);

        if(bac < 0.08){
            System.out.print("It is safe for you to drive.");
        }
        else{
            System.out.print("It is not safe for you to drive.");
        }

    }
}