package atena.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record IntegrationDto(
		@NotNull UUID id,
		String nome,
		String configuracao,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) {

}
