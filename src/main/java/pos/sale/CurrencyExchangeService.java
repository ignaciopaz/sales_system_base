package pos.sale;

import java.util.Currency;

public interface CurrencyExchangeService {
	public Double getCurrency(Currency from, Currency to);
}
