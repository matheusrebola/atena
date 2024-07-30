package atena.dtos;

import java.time.LocalDate;

public record ProjectCreateDto(
		String nome,
		String descricao,
		LocalDate dataInicio,
		LocalDate dataFim,
		LocalDate dataCriacao,
		LocalDate datAtualizacao,
		Boolean ativo) {

}
