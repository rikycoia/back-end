package com.epicode.gestione.uunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestione.DispositivoService;
import com.epicode.gestione.dto.DispositivoDto;
import com.epicode.gestione.models.Dispositivo;

@Component
public class DispositivoRunner implements ApplicationRunner {

	@Autowired
	private DispositivoService dispositivoService;
	
	@Autowired
	Dispositivo d1;
	
	@Autowired
	Dispositivo d2;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		dispositivoService.aggiungiDispositivo(d1);
		dispositivoService.aggiungiDispositivo(d2);

	}

}
