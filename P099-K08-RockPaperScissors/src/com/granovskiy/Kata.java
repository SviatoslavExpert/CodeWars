package com.granovskiy;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1 == "scissors" && p2 == "paper") return "Player 1 won!";
        if (p1 == "paper" && p2 == "scissors") return "Player 2 won!";
        if (p1 == "rock" && p2 == "scissors") return "Player 1 won!";
        if (p1 == "scissors" && p2 == "rock") return "Player 2 won!";
        if (p1 == "paper" && p2 == "rock") return "Player 1 won!";
        if (p1 == "rock" && p2 == "paper") return "Player 2 won!";
        if (p1 == p2) return "Draw!";
        return "Incorrect input";
    }
/*
    if(p1 == p2) return "Draw!";
    int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
    return "Player " + p + " won!";
*/

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
    }
}
