package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionServiceImpl;

public class SBUXPriceListener implements PriceListener {

	private ExecutionServiceImpl executionService = new ExecutionServiceImpl();
	
	@Override
	public void priceUpdate(String security, double price) {
		if(price <= 75.00) {
			executionService.buy(security, price, 30);
		}
	}

}
