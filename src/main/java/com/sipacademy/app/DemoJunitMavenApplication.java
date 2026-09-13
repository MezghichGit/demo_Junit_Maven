package com.sipacademy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sipacademy.app.utilitaire.Calcul;

@SpringBootApplication
public class DemoJunitMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJunitMavenApplication.class, args);
		Calcul c = new Calcul();
		
		double res = c.somme(10,20);
		
		double prod = c.produit(10, 20);
		
		System.out.println("La somme et le produit de 10 et 20 : "+res+" : "+ prod);
	}

}
