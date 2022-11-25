package mypackage;

import java.util.ArrayList;
import java.util.Objects;

import mypackage.Savings;

public class Savings {
	private ArrayList<Currency> listOfCoins = new ArrayList<Currency>();

	Currency money;

	public ArrayList<Currency> getListOfCoins() {
		return listOfCoins;
	}

	public void setLisofCoins(ArrayList<Currency> listOfCoins) {
		this.listOfCoins = listOfCoins;
	}

	@Override
	public String toString() {
		return "Savings [listOfCoins=" + listOfCoins + ", coins=" + money + "]";
	}

	void add(Currency x) {
		listOfCoins.add(x);
	}

	void remove(Currency x) {
		listOfCoins.remove(x);
	}

	void listOfCoins(Currency x) {
		System.out.println(getListOfCoins());
	}

	double totalConverted(Currency x) {
		double total = 0;
		total = x.conversor();
		return total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listOfCoins, money);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Objects.equals(listOfCoins, other.listOfCoins) && Objects.equals(money, other.money);		

	}

	
	
	
}
