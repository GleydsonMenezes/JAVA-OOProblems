package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of exercícies do you'll see: \n"
				+ "1 - Account\n"
				+ "2 - Products Vectors\n"
				+ "0 - Exit");
		int number = sc.nextInt();
		sc.nextLine();
		
		switch(number) {
			
		case 1:
				Account account;

				System.out.print("Enter account number: ");
				int num = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter account holder: ");
				String holder = sc.nextLine();
				System.out.println();
				System.out.println("Is there na initial deposit (y/n)? ");
				char caractere = sc.next().charAt(0);
				if (caractere == 'y') {
					System.out.println("Enter initial deposit value:");
					double initialDeposit = sc.nextDouble();
					account = new Account(num, holder, initialDeposit);
				} 
				else {
					account = new Account(num, holder);
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
				
				break;		
		case 2:
			int n = sc.nextInt();
			Product[] vector = new Product[n];
			
			for (int i = 0; i < n; i++) {
				sc.nextLine();
				String name = sc.nextLine();	
				double price = sc.nextDouble();
					vector[i] = new Product(name, price);
				}
			
			double sum = 0.0;
			for (int i=0; i<n; i++) {
				sum += vector[i].getPrice();
			}
			double avg = sum / n;
			System.out.printf("AVERAGE PRICE = %.2f%n", avg);
			
		}
		sc.close();
	}

}
