package mypackage;

import java.util.Objects;

import mypackage.Currency;

public abstract class Currency {

	double value;
	double exchange;
	public Object listOfCoins;
	public Object money;

	void info() {

	}

	double conversor() {
		double total = 0;
		return total;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(exchange, value);
	}

	@Override
	public String toString() {
		return "Money [value=" + value + "]";
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
		return Double.doubleToLongBits(exchange) == Double.doubleToLongBits(other.exchange)
				&& Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}

}
