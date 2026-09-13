package com.sipacademy.app.utilitaire;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalcul {
	
	@Test
	public void testSomme()
	{
		Calcul c = new Calcul();
		assertEquals(30,c.somme(10,20));
		
	}
	
	@Test
	public void testProduit()
	{
		Calcul c = new Calcul();
		assertEquals(200,c.produit(10,20));
		
	}

}
