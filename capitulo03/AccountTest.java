package capitulo03;

import java.util.Scanner;

public class AccountTest {
    public static void displayAccount(Account accountToDisplay) {
        System.out.println("Account Name: " + accountToDisplay.getName() +
                "\nAccount Balance: " + accountToDisplay.getBalance());
    }

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 0.00);
        Account account2 = new Account("John Blue", -7.33);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account1 balance \n\n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);


        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nnAdding %.2f to account1 balance \n\n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

    }
}
