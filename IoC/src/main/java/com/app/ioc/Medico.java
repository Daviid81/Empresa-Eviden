package com.app.ioc;

public class Medico {

	Utencilios utencilio;
	
	public void setUtencilio(Utencilios utencilio) {
		this.utencilio = utencilio;
	}
	
	public void operar () {
		System.out.println("Operando!");
		utencilio.usar();
	}
	
	
	
}
