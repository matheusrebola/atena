package br.org.gestao.atena.entities;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public record AgileMethods(
		UUID id,
		String nome,
		String descricao) 
{

}
