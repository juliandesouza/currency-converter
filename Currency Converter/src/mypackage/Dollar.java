package mypackage;

import java.util.Objects;

import mypackage.Dollar;

public class Dollar extends Currency{
	
	int idMoney = 01; 
	
	double exchange = 5.35; 
	
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
		Dollar other = (Dollar) obj;
		return idMoney == other.idMoney && Double.doubleToLongBits(exchange) == Double.doubleToLongBits(other.exchange);
	}

	@Override
	public String toString() {
		return "Dollar = " + value + "";
	}

	@Override
	double conversor() {
		double total = this.value * this.exchange;
		return total;
	}

}
