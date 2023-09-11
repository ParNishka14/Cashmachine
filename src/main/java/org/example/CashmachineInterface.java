package org.example;

public interface CashmachineInterface {

        void scanCard(int cardCode, boolean next);

        boolean checkCardNumber(int cardNumber);

        boolean askPinCode(int pinCode);
        void getUserInfo();

        void topUpBalance();

        void withdrawMoney();

        void getBalance();

        void pullOutCard();

}
