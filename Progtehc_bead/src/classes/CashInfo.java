 package com.classes;
 
 import com.Interfaces.IPaymentInfo;
 /*
 *Ez az osztály akkor lesz használva ha a kölcsönző személy készpénzzel akar fizetni
 */
 public class CashInfo implements IPaymentInfo {
	@Override
	public String info() {
		return "cash";
	}
	//Felülírjuk az interfészben található metódus visszatérési értékét.
 }
 