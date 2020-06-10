package pos.sale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Currency;

@RunWith(MockitoJUnitRunner.class)
public class SaleTest {
	
	//This test will be used for Unit Test Example
	@Test public void testChange() {
		// Complete the test code here with the following case:
		// Arrange: Sale of 77
		// Act: Pays with 100
		// Assert: Change is 23
	}
	
	
	/*
	 * 
	 //This code is useful for the Stub Example
	@Test public void testTotalUSDPayUSDChangeUSD() {
		Sale sale = new Sale(59D, Currency.getInstance("USD"));
		Double result = sale.getChange(100, Currency.getInstance("USD"), Currency.getInstance("USD"));
		assertEquals("Change calculated", Double.valueOf(41D), result);
	}
	
	@Test public void testTotalUSDPayEURChangeEUR() {
		CurrencyExchangeService cesStub = mock(CurrencyExchangeService.class);
		when(cesStub.getCurrency(Currency.getInstance("USD"), Currency.getInstance("EUR"))).thenReturn(0.75D);
		Sale sale = new Sale(160D, Currency.getInstance("USD"));
		sale.setCurrencyService(cesStub);
		Double result = sale.getChange(200, Currency.getInstance("EUR"), Currency.getInstance("EUR"));
		assertEquals("Change calculated", Double.valueOf(80D), result);
	}
	*/

}
