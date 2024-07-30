package atena.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import atena.entities.Projects;
import atena.entities.StatusTarefa;
import atena.entities.Users;

public record TaskCreateDto(
		String titulo,
		String descricao,
		LocalDate prazo,
		StatusTarefa statusTarefa,
		LocalDateTime dataCricao,
		LocalDateTime dataAtualizacao,
		Projects project,
		Users user) {

}
