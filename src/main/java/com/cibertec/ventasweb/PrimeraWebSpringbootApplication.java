package com.cibertec.ventasweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraWebSpringbootApplication{

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L,"Jose",17));
		personaService.crearPersona(new Persona(6L,"David",18));
		personaService.crearPersona(new Persona(7L,"Cristofer",17));
		personaService.crearPersona(new Persona(8L,"Andre",18));

		//Mostramos el número de personas
		System.out.println("Número de personas de la tabla : " + personaService.contarPersonas());

		//Mostramos la lista de personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la persona : " + p.getNombre()));
	}*/
}
