package registration;

import Client.ClientAccount;
import org.example.Bank;
import org.example.MyOwnScanner;
public class Registration {
    ClientAccount clientAccount = new ClientAccount();
    Bank bank = new Bank();
    public void registration() {
        System.out.println("Банк АТТ, Регистрация");
        System.out.println("Введите номер телефона");
        System.out.print("+");
        Long phoneNumber = MyOwnScanner.nextLong();
        System.out.println("Введите пароль");
        int password = MyOwnScanner.nextInte();
        System.out.println("Введите номер карты");
        int cardNumber = MyOwnScanner.nextInte();
        clientAccount.accountCard(cardNumber);
    }
}
