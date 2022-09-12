package com.epicode.gestione.dto;


import com.epicode.gestione.models.Stato;
import com.epicode.gestione.models.Tipo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DispositivoDto {

	private String name;
	private Tipo tipo;
	private Stato stato;
}
