package com.epicode.gestione;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestione.dto.DispositivoDto;
import com.epicode.gestione.models.Dispositivo;
import com.epicode.gestione.repository.DispositivoRepository;


@Service
public class DispositivoService {
	
	@Autowired
	private DispositivoRepository repo;
	
	private ObjectProvider<Dispositivo> dispositivoProvider;
	
	public Optional<Dispositivo> getById(Long id) {
		Optional<Dispositivo> dresult = repo.findById(id);
		return dresult;
	}
	
	public Dispositivo addDispositivo(DispositivoDto dispositivoDto) {
		if (repo.existsByName(dispositivoDto.getName())) {
			throw new EntityExistsException("Dispositivo già esistente");
		}
		Dispositivo d = dispositivoProvider.getObject();
		
		BeanUtils.copyProperties(dispositivoDto, d);
		
		return repo.save(d);
	}
	
	public void aggiungiDispositivo(Dispositivo disp) {
		repo.save(disp);
	}

	
	
	public Dispositivo modificaDispositivo(Long id, DispositivoDto dispositivoDto) {
		if (!repo.existsById(id)) {
			throw new EntityExistsException("Dispositivo non esistente");
		}else {
			Dispositivo d = repo.findById(id).get();
			
			BeanUtils.copyProperties(dispositivoDto, d);
			
			return repo.save(d);
		}
	}
	
	public void eliminaDispositivo(Long id) {
		if (!repo.existsById(id)) {
			throw new EntityExistsException("Dispositivo non esistente");
		}
						
			repo.deleteById(id);
		
	}
	
	public List<Dispositivo> trovaTutti() {
		return (List<Dispositivo>) repo.findAll();
	}
}
