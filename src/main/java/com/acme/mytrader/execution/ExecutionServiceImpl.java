package com.acme.mytrader.execution;

public class ExecutionServiceImpl implements ExecutionService {

	@Override
	public void buy(String security, double price, int volume) {
		System.out.println(String.format("Bought %d of %s at %.2f", volume, security, price));
		
	}

	@Override
	public void sell(String security, double price, int volume) {
		System.out.println("Sold " + volume + " of " + security + " at " + price);
	}

}
