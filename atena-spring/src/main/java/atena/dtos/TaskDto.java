package atena.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import atena.entities.Projects;
import atena.entities.StatusTarefa;
import atena.entities.Users;
import jakarta.validation.constraints.NotNull;

public record TaskDto(
		@NotNull UUID id,
		String titulo,
		String descricao,
		LocalDate prazo,
		StatusTarefa statusTarefa,
		LocalDateTime dataCricao,
		LocalDateTime dataAtualizacao,
		Projects project,
		Users user) {

}
