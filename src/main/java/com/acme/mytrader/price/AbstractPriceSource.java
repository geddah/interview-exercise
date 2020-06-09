package com.acme.mytrader.price;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPriceSource implements PriceSource {

	protected List<PriceListener> priceListeners = new ArrayList<>();
	
	@Override
	public void addPriceListener(PriceListener listener) {
		if(!priceListeners.contains(listener)) {
			priceListeners.add(listener);
		}
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		if(priceListeners.contains(listener)) {
			priceListeners.remove(listener);
		}
	}
	
	@Override
	public void updatePrice(double price) {
		for(PriceListener priceListener: priceListeners) {
			priceListener.priceUpdate(getTckr(), price);
		}
	}

}
