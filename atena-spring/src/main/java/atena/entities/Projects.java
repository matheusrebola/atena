package atena.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Projects(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		LocalDate dataInicio,
		LocalDate dataFim,
		LocalDate dataCriacao,
		LocalDate datAtualizacao,
		Boolean ativo) 
{

}
