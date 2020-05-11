// Ez az osztály ellenőrzi fizetésor, hogy az adott autó kölcsönözve van-e és amennyiben igen, hibát dob vissza
// @Override-ban a PaymentStrategy-ben implementált abstract string érétkét írjuzk felül


package com.strategy;

import com.Exceptions.InvalidPaymentException;
import com.Interfaces.IPaymentInfo;
import com.classes.CashInfo;

public class CashPayment extends PaymentStrategy{
	@Override
	public String Pay(IPaymentInfo info) throws InvalidPaymentException {
		CashInfo information = (CashInfo)info;
		try
		{
			return "Kölcsönözve " + information.getName() + "által!";
		}
		catch (NullPointerException e) 
		{
			throw new InvalidPaymentException("Az autót nem lehet kölcsönözni, ugyanis egy másik felhasználó által már kölcsönözve van!");
		}
	}
} 