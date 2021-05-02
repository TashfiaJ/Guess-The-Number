/*
           Create a class Game, which allows a user to play "Guess the Number"
           game once. Game should have the following methods:
           1. Constructor to generate the random number
           2. takeUserInput() to take a user input of number
           3. isCorrectNumber() to detect whether the number entered by the user is true
           4. getter and setter for noOfGuesses
           Use properties such as noOfGuesses(int), etc to get this task done!
        */
package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number,guessNumber;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses() {
        this.noOfGuesses = 0;
    }

    private int noOfGuesses;
    public Game(){
        Random rand = new Random();
        this.number= rand.nextInt(100);

    }
    public void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner s =new Scanner(System.in);
        guessNumber=s.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(number==guessNumber)
        {
            System.out.println("You have guessed it right in "+getNoOfGuesses()+ " attempts.");
            return true;
        }
        else if(number>guessNumber){
            System.out.println("Too low...");
            return false;
        }
        else{
            System.out.println("Too high...");
            return false;
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {

        Game g  =  new Game();

        boolean b= false;
        while (!b) {
            g.takeUserInput();
           b= g.isCorrectNumber();
        }




    }
}
