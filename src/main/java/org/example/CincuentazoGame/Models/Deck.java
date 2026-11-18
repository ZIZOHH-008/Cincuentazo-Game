package org.example.CincuentazoGame.Models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> Cards;


    public Deck(){
        Cards = new ArrayList<>();
        char suits[] = {'C','D','P','T'};

        for(int deck = 0; deck<1; deck++){   // Changing the deck comparator increases the number of decks.
            for(int i = 0; i < 4; i++){

                Cards.add(new Card(11,"A",suits[i])); //A'

                for(int j = 2; j <= 10; j++){
                    Cards.add(new Card(j, String.valueOf(j), suits[i]));    //All Cards
                }

                //JQK Cards
                Cards.add(new Card(10,"J",suits[i]));
                Cards.add(new Card(10,"Q",suits[i]));
                Cards.add(new Card(10,"K",suits[i]));
            }
        }
        Shuffle();
    };



    public void Shuffle(){
        Collections.shuffle(Cards);
    }


    //Gets position 0, deletes it, and returns it
    public Card dealCard() {
        if (Cards.isEmpty()) {
            return null;
        }
        return Cards.remove(0);
    }



    public int remainCards(){
        return Cards.size();
    }



    //To take the cards from underneath the deck
    public void recycleCards(){

    }
}
