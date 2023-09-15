package Client;

import org.example.Bank;
import org.example.Card;

import java.util.ArrayList;

public class ClientAccount implements TClientAccount {
    Bank bank = new Bank();
    ArrayList<Client> clients = new ArrayList<>();
    int currentCardIndex;
    public void getAccount() {
        System.out.println("1 карта: " + bank.getCards().get(currentCardIndex).cardNumber);
    }
    public void createAccount(Long phoneNumber, int password , int cardNumber) {
        for(int i = 0; i <= bank.getCards().size(); i++){
            if (cardNumber == bank.getCard(i)){
                clients.add(new Client(phoneNumber, password, bank.getCard(i)));
            }
        }
    }
}
