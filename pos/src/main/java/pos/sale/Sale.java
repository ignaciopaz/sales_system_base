package pos.sale;

import java.util.Currency;

public class Sale {
	private Double total;
	/*//Use for Stub example:
	private Currency currency;
	private CurrencyExchangeService currencyExchange;
	
	public Sale(Double total, Currency currency) {
		this.total=total;
		this.currency=currency;
	}
	
	public Sale(double total) {
		this.total = total;
	}
	*/
	public Double getTotal() {
		return total;
	}
	
	public Double getChange(double amount) {
		//this is a bug to fix. Create the test that fails first in SaleTest
		return getTotal() - amount;
	}
	/*
	//Use for Stub example:
	public Double getChange(double amount, Currency pay, Currency change) {
		if (!pay.equals(currency)) {
			double totalConverted = getTotal() * currencyExchange.getCurrency(currency, pay);
			return amount - totalConverted;
		}
		return  getChange(amount);
	}

	public void setCurrencyService(CurrencyExchangeService currencyExchangeService) {
		this.currencyExchange = currencyExchangeService;		
	}
	*/
}
