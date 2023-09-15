package org.example;


import java.util.ArrayList;

public class Bank implements BankInterface {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Integer> pinCods = new ArrayList<>();
    public Bank() {
        names.add("Andrei");
        names.add("Nikita");
        names.add("Stepan");
        names.add("Ilya");
        names.add("Gayorgy");
        cards.add(new Card(8342,0000,623, 0));
        cards.add(new Card(6435,0000,453, 0));
        cards.add(new Card(7343,0000,983, 0));
        cards.add(new Card(8989,0000,962, 0));
        cards.add(new Card(8990,0000,960, 0));
    }

    @Override
    public void getUserinfo(int indexCard) {
        System.out.println("Имя держателя: " + names.get(indexCard));
    }
    @Override
    public int getCard(int index) {
        return cards.get(index).cardNumber;
    }

    @Override
    public boolean getPinCode(int code, int indexCard) {
        if(cards.get(indexCard).getPin() == code){
            return true;
        }
        return false;
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
}
