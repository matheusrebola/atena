package br.org.gestao.atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Calendar(
		UUID id,
		String titulo,
		String descricao,
		LocalDateTime dataEvento,
		Projects project) 
{

}
