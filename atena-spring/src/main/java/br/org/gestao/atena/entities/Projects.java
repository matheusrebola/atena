package br.org.gestao.atena.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record Projects(
		UUID id,
		String nome,
		String descricao,
		LocalDate dataInicio,
		LocalDate dataFim,
		LocalDate dataCriacao,
		LocalDate datAtualizacao,
		boolean ativo) 
{

}
