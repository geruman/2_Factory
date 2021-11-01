package com.geruman.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.peluches.Peluche;
import com.geruman.peluches.PelucheFactory;
import com.geruman.peluches.Peluches;

class PelucheFactoryTest {

	@Test
	void test() {
		PelucheFactory factory = new PelucheFactory();
		Peluche osoDePeluche = factory.crear(Peluches.OSO);
		assertEquals(true, osoDePeluche instanceof Peluche);
		Peluche pelucheNulo = factory.crear(null);
		assertEquals(true, pelucheNulo == null);
		
	}

}
