package org.jacademie.tdweb.business;

import javax.ejb.Stateless;

@Stateless
public class PriceCalculator {

	public final static Double TVA = 1.25D;
	
	public Double calculateTTCPrice(Double priceHT) {
		
		return (TVA * priceHT);
	}
}
