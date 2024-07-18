package br.org.gestao.atena.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Tasks(
		@Id UUID id,
		String titulo,
		String descricao,
		LocalDate prazo,
		StatusTarefa statusTarefa,
		LocalDateTime dataCricao,
		LocalDateTime dataAtualizacao,
		Projects project,
		Users user) 
{

}
