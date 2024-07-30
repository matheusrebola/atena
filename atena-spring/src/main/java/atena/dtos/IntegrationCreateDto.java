package atena.dtos;

import java.time.LocalDateTime;

public record IntegrationCreateDto(
		String nome,
		String configuracao,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) {

}
