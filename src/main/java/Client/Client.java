package Client;

import org.example.Card;

public class Client {
    public String name;
    public Long numberPhone;
    private Card card;

    private int password;

    public Client (String name, Long numberPhone, Card card){
        this.name = name;
        this.numberPhone = numberPhone;
        this.card = card;
    }
    public Card getCardClient (){
        return card;
    }
    public int getPassword() {
        return password;
    }
}
