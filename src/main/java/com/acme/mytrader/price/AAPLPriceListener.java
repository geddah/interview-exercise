package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionServiceImpl;

public class AAPLPriceListener implements PriceListener {

	private ExecutionServiceImpl executionService = new ExecutionServiceImpl();
	
	@Override
	public void priceUpdate(String security, double price) {
		if(price <= 280.00) {
			executionService.buy(security, price, 10);
		}
	}

}
