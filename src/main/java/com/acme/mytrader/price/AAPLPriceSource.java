package com.acme.mytrader.price;

public class AAPLPriceSource extends AbstractPriceSource {

	public AAPLPriceSource() {
		addPriceListener(new AAPLPriceListener());
	}
	
	@Override
	public String getTckr() {
		return "AAPL";
	}

}
