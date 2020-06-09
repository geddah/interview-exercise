package com.acme.mytrader.price;

public class MSFTPriceSource extends AbstractPriceSource {

	public MSFTPriceSource() {
		addPriceListener(new MSFTPriceListener());
	}
	
	@Override
	public String getTckr() {
		return "MSFT";
	}

}
