package com.acme.mytrader.price;

public class SBUXPriceSource extends AbstractPriceSource {

	public SBUXPriceSource() {
		addPriceListener(new SBUXPriceListener());
	}
	
	@Override
	public String getTckr() {
		return "SBUX";
	}
}
