package mypackage;

import java.util.Objects;

import mypackage.Euro;

public class Euro extends Currency {

	int idMoney = 02;
	
	double exchange = 5.53; 

	@Override
	public String toString() {
		return "Euro = " + value + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idMoney, exchange);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return idMoney == other.idMoney && Double.doubleToLongBits(exchange) == Double.doubleToLongBits(other.exchange);
	}

	@Override
	double conversor() {
		double total = this.value * this.exchange;
		return total;
	}

}
