package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Program");
        int position = 0;
        System.out.println("Starting position of the game is " + position);
        int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The value of the die is " + randomCheck);
        int option = (int) Math.floor(Math.random() * 10) % 3;
        switch (option) {
            case 0:
                System.out.println("Ladder \nplayer moves ahead by " + randomCheck);
                position += randomCheck;
                break;
            case 1:
                System.out.println("Snake \nplayer moves behind by " + randomCheck);
                position -= randomCheck;
                break;
            default:
                System.out.println("No play \nplayer remains in same position");
                position += 0;
                break;
        }
        System.out.println("The position of the player is " + position);
    }
}
