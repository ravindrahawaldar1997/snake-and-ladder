package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    final static int winningPosition = 100;
    final static int restart = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int position = 0;
        int diceRoll = 0;
        while (position != winningPosition) {
            diceRoll++;
            int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("The value of the die is " + randomCheck);
            int option = (int) (Math.random() * 10) % 3;
            switch (option) {
                case 1:
                    System.out.println("Ladder \nplayer moves ahead " + randomCheck);
                    position += randomCheck;
                    break;
                case 2:
                    System.out.println("Snake \nplayer moves behind " + randomCheck);
                    position -= randomCheck;
                    break;
                default:
                    System.out.println("No Play \nplayer remains in same position");
                    position += 0;
                    break;
            }
            if (position == 100) {
                break;
            } else if (position > 100) {
                position -= randomCheck;
                System.out.println("Dice face is invalid stay in the same position");
            } else if (position < 0) {
                position = restart;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position after the roll of die: " + position);
            }
        }
        System.out.println("You Won The Game");
        System.out.println("The number of time dice rolls is " +diceRoll);
    }
}