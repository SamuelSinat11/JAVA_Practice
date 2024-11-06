package OOP.Bank;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Bank bank = new Bank();
        Account account1 = new Account("Samuel", "235bsdgi23s", 1000);
        Account account2 = new Account("KimSo", "133536dfs",  1000);
        Account account3 = new Account("HakSean", "235bsd234", 1000);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("======================");
        System.out.println("After you deposits your money:  ");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("After you withdraws your money:  ");
        bank.withdrawMoney(account2, 4000);
        System.out.println(account2.getAccountInfo());
        System.out.println("After you withdraws your money:  ");
        bank.withdrawMoney(account3, 0);
        System.out.println(account3.getAccountInfo());

    }
}
