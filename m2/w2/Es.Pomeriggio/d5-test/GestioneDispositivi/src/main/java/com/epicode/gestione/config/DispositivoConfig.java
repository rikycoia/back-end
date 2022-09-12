package com.epicode.gestione.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.epicode.gestione.models.Dispositivo;
import com.epicode.gestione.models.Stato;
import com.epicode.gestione.models.Tipo;

@Configuration
public class DispositivoConfig {

	@Bean
	@Primary
	public Dispositivo newDispositivo() {

		Dispositivo d1 = new Dispositivo();

		d1.setName("Smartphone Nello");
		d1.setTipo(Tipo.SMARTPHONE);
		d1.setStato(Stato.DISPONIBLE);

		return d1;

	}

}
