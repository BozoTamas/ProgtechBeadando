package com.classes;

import com.Interfaces.IPayementInfo;
/**
*Ezt az osztályt fogom arra használni, hogy leelenőrizzem, hogy érvényes bankkártyával akar-e fizetni a kliens
*A kártya hitelességét egy egyszerű ellenőrzéssel fogjuk ellenőrizni. (van-e benne betű)
*/

public class BankCardInfo implements IPayementInfo {
	@Override
	public String info() {
		return "credit card";
	}
	/**
	* Az interrfészben található metódus értékét felülírja.
	*/

}