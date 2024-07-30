package atena.dtos;

import java.time.LocalDateTime;

public record UserCreateDto(
		String nome,
		String email,
		String senha,
		LocalDateTime dataCriacao,
		LocalDateTime dataAtualizacao) {

}
