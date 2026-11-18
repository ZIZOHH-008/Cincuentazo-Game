package org.example.CincuentazoGame.Models;

public class Player {
    private String name;
    private boolean resultRound;

    public Player(String name){
        this.name = name;
    }

    public void takeTurn(){}

    public boolean getResultRound(){
        return resultRound;
    }

}
