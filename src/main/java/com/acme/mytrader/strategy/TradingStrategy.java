package com.acme.mytrader.strategy;

import com.acme.mytrader.price.AAPLPriceSource;
import com.acme.mytrader.price.MSFTPriceSource;
import com.acme.mytrader.price.SBUXPriceSource;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {
	
	public static void main(String[] args) {
		
		AAPLPriceSource aaplPriceSource = new AAPLPriceSource();
		MSFTPriceSource msftPriceSource = new MSFTPriceSource();
		SBUXPriceSource sbuxPriceSource = new SBUXPriceSource();
		
		for(int i = 0; i < 10; i++) {
			double currentAaplPrice = ((Math.random() * (290.00 - 270.00)) + 270.00);
			double currentMsftPrice = ((Math.random() * (170.00 - 150.00)) + 150.00);
			double currentSbuxPrice = ((Math.random() * (80.00 - 65.00)) + 65.00);
			
			
			aaplPriceSource.updatePrice(currentAaplPrice);
			msftPriceSource.updatePrice(currentMsftPrice);
			sbuxPriceSource.updatePrice(currentSbuxPrice);
		}
		
	}
}
