package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println();
		System.out.println("Is there na initial deposit (y/n)? ");
		char caractere = sc.next().charAt(0);
		if (caractere == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} 
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println(account);
		System.out.println();
		
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated " + account);
		System.out.println("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated " + account);

		sc.close();
	}

}
