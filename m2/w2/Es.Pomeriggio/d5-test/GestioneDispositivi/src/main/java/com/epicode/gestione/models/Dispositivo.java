package com.epicode.gestione.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="dispositivi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder(toBuilder = true)
public class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@Enumerated(EnumType.STRING)
	private Stato stato;
	
	Dispositivo d = Dispositivo.builder()
			.name("Laptop")
			.tipo(Tipo.LAPTOP)
			.stato(Stato.DISPONIBLE)
			.build();
	
	Dispositivo.DispositivoBuilder dispositivoBuilder = d.toBuilder();
	
	Dispositivo d2 = dispositivoBuilder.id(id).build();
	assertThat()
	

}
