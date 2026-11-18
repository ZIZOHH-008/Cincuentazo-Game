package org.example.CincuentazoGame.Models;

import java.util.ArrayList;



public class Hand {
    private ArrayList<Card> Cards;
    private static final int maxSize = 4;


    public Hand() {
        Cards = new ArrayList<>();
    }


    public void addCard(Card letter) {
        if (Cards.size() < maxSize) {
            Cards.add(letter);
        }
        else{
            System.out.println("Error - No puede tomar cartas");
        }
    }


    public void removeCard(int index) {
        Cards.remove(index);
    }


    public int getSize() {
        return Cards.size();
    }


    //I'm not sure
    public boolean isFull() {
        return Cards.size() == maxSize;
    }
    public Card getCard(int index) {
        return Cards.get(index);
    }
}