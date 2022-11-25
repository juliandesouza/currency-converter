package mypackage;

import java.util.Scanner;

import mypackage.Savings;
import mypackage.Dollar;
import mypackage.Euro;
import mypackage.Currency;
import mypackage.Real;

public class Main {

	public static void mainMenu() {
		System.out.println("__________________________________");
		System.out.println("HELLO! CHOOSE AN OPTION:");
		System.out.println("1 - DEPOSIT AN AMOUNT");
		System.out.println("2 - REMOVE ALL MY MONEY");
		System.out.println("3 - SHOW ALL MY MONEY");
		System.out.println("4 - CONVERT MY CURRENCIES");
		System.out.println("5 - FINISH THIS PROGRAM");
	}

	public static void secondMenu() {
		System.out.println("__________________________________");
		System.out.println("THESE ARE THE OPTIONS: ");
		System.out.println("1 - Dollar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println("4 - None, back to Main Menu");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int choose = 0; 

		Savings savings = new Savings(); 
		
		Currency dollar = new Dollar();
		savings.getListOfCoins().add(dollar);
		Currency euro = new Euro();
		savings.getListOfCoins().add(euro);
		Currency real = new Real();
		savings.getListOfCoins().add(real);

		while (choose != 5) {
			mainMenu();
			System.out.println("Choose a number and type above: ");
			choose = teclado.nextInt();

			if (choose == 1) {
				secondMenu();
				System.out.println("Which one do you want to add?");
				choose = teclado.nextInt(); 
	
				if (choose == 1) {
					System.out.println("How much dollars do you want?");
					dollar.value += teclado.nextDouble();
					choose = 0;
				} else if (choose == 2) {
					System.out.println("How much euros do you want?");
					euro.value += teclado.nextDouble();
					choose = 0;
				} else if (choose == 3) {
					System.out.println("How much reais do you want?");
					real.value += teclado.nextDouble();
					choose = 0;
				} else if (choose == 4) {
					choose = 0;
					System.out.println("");
				}

			}

			if (choose == 2) {
				
				secondMenu();
				System.out.println("Which coin do you want to remove?");
				choose = teclado.nextInt();
				if (choose == 1) {
					System.out.println("How much dollars do you want to remove?");
					dollar.value -= teclado.nextDouble();
					choose = 0;
				} else if (choose == 2) {
					System.out.println("How much euros do you want to remove?");
					euro.value -= teclado.nextDouble();
					choose = 0;
				} else if (choose == 3) {
					System.out.println("How much reais do you want to remove?");
					real.value -= teclado.nextDouble();
					choose = 0;
				} else if (choose == 4) {
					choose = 0;
					System.out.println("");
				}

			}

			if (choose == 3) {
				
				savings.listOfCoins(null);
				System.out.println("");
			}

			if (choose == 4) {
				System.out.println("__________________________________");
				System.out.println("See your coins here:");
				System.out.println("1 - Dollar");
				System.out.println("2 - Euro");
				System.out.println("3 - All converted to Real");
				System.out.println("4 - Main Menu");
				System.out.println("Which coin do you want to convert to Real? ");
				choose = teclado.nextInt();

				if (choose == 1) {
					System.out.println("Dollar to Real= " + savings.totalConverted(dollar));
					choose = 0;
				} else if (choose == 2) {
					System.out.println("Euro to Real= " + savings.totalConverted(euro));
					choose = 0;
				} else if (choose == 3) {
					double total = 0;
					total += savings.totalConverted(real);
					total += savings.totalConverted(dollar);
					total += savings.totalConverted(euro);
					System.out.println(total);
					System.out.println("Value of all coins converted to Real= " + total);
					choose = 0;
				} else if (choose == 4) {
					choose = 0;
					System.out.println("");
				}

			}

		}

		System.out.println("See you next time!");

	}

}
