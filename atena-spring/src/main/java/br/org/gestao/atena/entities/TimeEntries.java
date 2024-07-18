package br.org.gestao.atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record TimeEntries(
		@Id UUID id,
		LocalDateTime tempoGasto,
		LocalDateTime dataRegistro,
		Tasks task) 
{

}
