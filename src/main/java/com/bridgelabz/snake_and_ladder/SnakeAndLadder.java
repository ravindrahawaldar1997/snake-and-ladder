package com.bridgelabz.snake_and_ladder;

public class SnakeAndLadder {
    final static int winningPosition = 100;
    final static int restart = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int position = 0;
        while (position != winningPosition) {
            int randomCheck = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
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
                System.out.println("You won the game.");
            } else if (position < 0) {
                position = restart;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position: " + position);
            }
        }
    }
}