package com.epicode.gestione.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestione.DispositivoService;
import com.epicode.gestione.dto.DispositivoDto;
import com.epicode.gestione.models.Dispositivo;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/dispositivi")
@AllArgsConstructor
public class DispositivoController {

	@Autowired
	private DispositivoService dispositivoService;

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {

		Optional<Dispositivo> disp = dispositivoService.getById(id);

		if (disp.isPresent()) {
			return new ResponseEntity<Dispositivo>(disp.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Il dispositivo con " + id + " non è stato trovato ",
					HttpStatus.NOT_FOUND);
		}

	}
	@GetMapping
	public List<Dispositivo> trovaTutti() {
		return dispositivoService.trovaTutti();
	}

	@PostMapping("/crea")
	public ResponseEntity<?> creaDispositivo(@RequestBody DispositivoDto dispositivoDto) {

		return ResponseEntity.ok(dispositivoService.addDispositivo(dispositivoDto));
	}

	@PutMapping("/modifica/{id}")
	public ResponseEntity<?> modificaDispositivo(@PathVariable Long id, DispositivoDto dispositivoDto) {
		return ResponseEntity.ok(dispositivoService.modificaDispositivo(id, dispositivoDto));
	}

	@DeleteMapping("/elimina/{id}")
	public ResponseEntity<?> modificaDispositivo(@PathVariable Long id) {
		dispositivoService.eliminaDispositivo(id);
		return ResponseEntity.ok("Dispositivo Eliminato");

	}
}
