package br.org.gestao.atena.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Users(
		@Id UUID id,
		String nome,
		String email,
		String senha,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) 
{

}
