package org.example.CincuentazoGame.Models;

public class Card {
    private int nominalValue;
    private String cardLetterNumber;
    private char suit; //"Palo"


    public Card(int nominalValue, String cardLetterNumber, char suit){
        this.nominalValue= nominalValue;
        this.cardLetterNumber = cardLetterNumber;
        this.suit = suit;
    }

    public int getValue(){
        return nominalValue;
    }

    public String getLetterNumber(){
        return cardLetterNumber;
    }

}





