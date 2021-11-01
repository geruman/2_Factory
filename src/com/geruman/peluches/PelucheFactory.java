package com.geruman.peluches;

public class PelucheFactory {
	public Peluche crear(Peluches tipoDePeluche) {
		if(tipoDePeluche == Peluches.OSO) {
			return new OsoDePeluche();
		}
		return null;
	}
}
