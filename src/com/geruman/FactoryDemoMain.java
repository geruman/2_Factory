package com.geruman;

import com.geruman.peluches.Peluche;
import com.geruman.peluches.PelucheFactory;
import com.geruman.peluches.Peluches;

public class FactoryDemoMain {
	public static void main(String[] args) {
		System.out.println("Esta es una demo del patron Factory method");
		PelucheFactory factory = new PelucheFactory();
		Peluche peluche = factory.crear(Peluches.OSO);
		System.out.println(peluche.tipoDePeluche());
	}
}
