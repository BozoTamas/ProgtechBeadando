package com.classes;

import com.Interfaces.IPayementInfo;
import com.models.db_models.Users;
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
	private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }
	
	
	//Beállítjuk a kárya számát
    public void setCardNumber(String cardNumber) throws IllegalArgumentException {
        if(cardNumber.matches(".*[a-zA-Z].*")){
            throw new IllegalArgumentException("A kártya csak számokat tartalmazhat!");
        }
        this.cardNumber = cardNumber;
    }

    private Users user;

    public void setUser(Users user){
        this.user = user;
    }

    public String getName(){
        return user.getFirst_name() + " " + user.getLast_name();
    }
}