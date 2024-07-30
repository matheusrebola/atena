package atena.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record AgileMethodsDto(
		@NotNull UUID id,
		String nome,
		String descricao) {

}
