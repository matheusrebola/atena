package atena.dtos;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record ProjectDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		LocalDate dataInicio,
		LocalDate dataFim,
		LocalDate dataCriacao,
		LocalDate datAtualizacao,
		Boolean ativo) {

}
