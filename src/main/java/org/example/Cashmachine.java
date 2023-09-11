package org.example;
import java.util.Scanner;
public class Cashmachine implements CashmachineInterface {
    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);
    int currentCard;
    int currentCardIndex;
    int countTry = 0;
    @Override
    public void scanCard(int cardCode, boolean next) {
        if(!next){
            System.out.print("Введите код карты: ");
            currentCard = MyOwnScanner.nextInte();
        }
        if (currentCard == -1) {
            System.out.println("Ввели не правильное значение");
            scanCard(0, false);
        } else {
            if (checkCardNumber(currentCard)) {
                System.out.print("");
                System.out.println("Введите пин код: ");
                    int pinCode = MyOwnScanner.nextInte();
                    System.out.println(pinCode);
                    if(pinCode == -1){
                        System.out.println("Ввели не правильное значение");
                        scanCard(currentCard, true);
                    } else {
                        if (askPinCode(pinCode)) {
                            System.out.println("Правильно!");
                            inputInterface();
                            if (bank.cards.get(currentCardIndex).isBlocket()) {
                                System.out.println("Карта заблокирована");
                            } else
                                bank.getUserinfo(currentCardIndex);
                        } else {
                            System.out.println("Не правильный пин код. Повторите попытку");
                            countTry++;
                            if (countTry >= 3) {
                                bank.cards.get(currentCardIndex).setBlocket(true);
                                System.out.println("Ваша карта заблокирована!!((");
                            }
                            scanCard(currentCard, false);

                        }
                    }

            } else System.out.println("Карта не найдена");

        }
    }

    void inputInterface(){
        while (true){
            System.out.println("Выбирите действие 1-пополнить 2-снять 3-текущий баланс 4-вытащить карту");
            switch (sc.nextInt()){
                case 1 -> topUpBalance();
                case 2 -> withdrawMoney();
                case 3 -> getBallance();
                case 4 -> pullOutCard();
            }

        }
    }

    @Override
    public boolean checkCardNumber(int cardNumber) {
        for(int i = 0; i <= bank.cards.size(); i++){
            if (currentCard == bank.getCard(i)){
                currentCardIndex = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean askPinCode(int pinCode) {

        return bank.getPinCode(pinCode,currentCardIndex);
    }

    @Override
    public void getUserInfo() {
        System.out.println();
    }

    @Override
    public void topUpBalance() {
        System.out.print("Сумма пополенения: ");
        bank.cards.get(currentCardIndex).setBalance(bank.cards.get(currentCardIndex).getBalance() + sc.nextInt());
        System.out.println("УСПЕШНО! Ваш баланс теперь : " + bank.cards.get(currentCardIndex).getBalance());
    }

    @Override
    public void withdrawMoney() {
        System.out.print("Сумма списания: ");
        bank.cards.get(currentCardIndex).setBalance(bank.cards.get(currentCardIndex).getBalance() - sc.nextInt());
        System.out.println("УСПЕШНО! Ваш баланс теперь : " + bank.cards.get(currentCardIndex).getBalance());
    }

    @Override
    public void getBallance() {
        System.out.println("Ваш баланс: " + bank.cards.get(currentCardIndex).getBalance());
    }

    @Override
    public void pullOutCard() {
        System.out.println("Хорошего дня!");
        System.exit(0);
    }

}
