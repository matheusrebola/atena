package br.org.gestao.atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Integrations(
		UUID id,
		String nome,
		String configuracao,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) 
{

}
