package br.org.gestao.atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Reports(
		UUID id,
		TipoRelatorio tipoRelatorio,
		LocalDateTime dataGeracao,
		String conteudo,
		Projects project) 
{

}
