package br.org.gestao.atena.entities;

import jakarta.persistence.Entity;

@Entity
public record ProjectAgileMethods(
		AgileMethods agileMethods,
		Projects project) 
{

}
