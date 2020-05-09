// Ez az osztály kártyás fizetéskor ellenőrzi, hogy az adott kártya érvényes-e.
// @Override segítsgével az implementált abstract string értékét írjuk felül
// Validálni is kell a kártyát, ezt külön tesszük meg.

package com.strategy;

import com.Exceptions.InvalidPaymentException;
import com.Interfaces.IPaymentInfo;
import com.classes.BankCardInfo;

public class BankCardPayment extends PaymentStrategy {
	@Override
	public String Pay(IPaymentInfo info) throws InvalidPaymentException {
        BankCardInfo information = (BankCardInfo) info;
        if(validation(information)){
            return "Sikeresen kikölcsönözve " + information.getName() + "felhasználó által!";
        }
        else
            throw new InvalidPaymentException("Sikertelen kölcsönzés, a bankkártya nem hiteles!");
    }
	
	public boolean validation(BankCardInfo information){
        if(information.getCardNumber().length() == 16 )
            return true;
        else return false;
    }
}